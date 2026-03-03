package com.example.demo.redeemapiconsume.dto;

import jakarta.validation.constraints.NotBlank;

public class RedeemRequest {
    
    @NotBlank(message = "transactionId is required and cannot be empty")
    private String transactionId;
    @NotBlank(message = "agentId is required and cannot be empty")
    private String agentId;
    private String digest;
    @NotBlank(message = "cardNo is required and cannot be empty")
    private String cardNo;
    @NotBlank(message = "orderDateTime is required and cannot be empty")
    private String orderDateTime;
    @NotBlank(message = "orderAmount is required and cannot be empty")
    private String orderAmount;
    @NotBlank(message = "redeemOrderNo is required and cannot be empty")
    private String redeemOrderNo;

    // Getters
    public String getTransactionId() { return transactionId; }
    public String getAgentId() { return agentId; }
    public String getDigest() { return digest; }
    public String getCardNo() { return cardNo; }
    public String getOrderDateTime() { return orderDateTime; }
    public String getOrderAmount() { return orderAmount; }
    public String getRedeemOrderNo() { return redeemOrderNo; }

    // Setters
    public void setTransactionId(String transactionId) { this.transactionId = transactionId; }
    public void setAgentId(String agentId) { this.agentId = agentId; }
    public void setDigest(String digest) { this.digest = digest; }
    public void setCardNo(String cardNo) { this.cardNo = cardNo; }
    public void setOrderDateTime(String orderDateTime) { this.orderDateTime = orderDateTime; }
    public void setOrderAmount(String orderAmount) { this.orderAmount = orderAmount; }
    public void setRedeemOrderNo(String redeemOrderNo) { this.redeemOrderNo = redeemOrderNo; }
}
