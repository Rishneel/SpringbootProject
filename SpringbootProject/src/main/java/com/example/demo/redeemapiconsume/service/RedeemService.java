package com.example.demo.redeemapiconsume.service;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.redeemapiconsume.RedeemApiException;
import com.example.demo.redeemapiconsume.dto.RedeemRequest;
import com.example.demo.redeemapiconsume.dto.RedeemResponse;

@Service
public class RedeemService {
    
    private final RestTemplate restTemplate;

    private static final Logger LOGGER = Logger.getLogger(RedeemService.class.getName());
    
    @Value("${redeem.api.url}")
    private String redeemApiUrl;

    @Value("${redeem.api.secretKey}")
    private String secretKey;

    public String createDigest(String transactionId, String agentId, String secretKey) throws NoSuchAlgorithmException{
        String dataToHash = transactionId + agentId + secretKey;
        MessageDigest digester = MessageDigest.getInstance("SHA-512");
        byte[] hashBytes = digester.digest(dataToHash.getBytes(StandardCharsets.UTF_8));
        String base64 = Base64.getEncoder().encodeToString(hashBytes);
        return base64;
    }

    public RedeemService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public RedeemResponse sendRedeem(RedeemRequest request){//request.digest
        Map<String, Object> responseMap = new LinkedHashMap<>();
        try {
            String digestCreation = createDigest(request.getTransactionId(), request.getAgentId(), secretKey);
            request.setDigest(digestCreation);
            LOGGER.info("Digest Created and Logged: " + digestCreation);
            return restTemplate.postForObject(redeemApiUrl, request, RedeemResponse.class);
        } catch (Exception e) {
            throw new RedeemApiException("Failed to call redeem API: " + e);
        }
    }


}
