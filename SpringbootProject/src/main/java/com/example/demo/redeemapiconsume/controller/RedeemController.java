package com.example.demo.redeemapiconsume.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.redeemapiconsume.dto.RedeemRequest;
import com.example.demo.redeemapiconsume.dto.RedeemResponse;
import com.example.demo.redeemapiconsume.service.RedeemService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/redeem") //base ppath
public class RedeemController {

    private final RedeemService redeemService;

    public RedeemController(RedeemService redeemService) {
        this.redeemService = redeemService;
    }

    @PostMapping("/post")
    public ResponseEntity<RedeemResponse> sendRedeem(@RequestBody @Valid RedeemRequest request) {
        RedeemResponse response = redeemService.sendRedeem(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }


}