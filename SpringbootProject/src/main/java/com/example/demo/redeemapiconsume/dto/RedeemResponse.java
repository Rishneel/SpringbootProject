package com.example.demo.redeemapiconsume.dto;

// What you GET BACK from the external API
public class RedeemResponse {
    private String transactionId;
    private String agentId;
    private String digest;
    private int code;
    private Object data;
    private String message;

    // Getters
    public String getTransactionId() { return transactionId; }
    public String getAgentId() { return agentId; }
    public String getDigest() { return digest; }
    public int getCode() { return code; }
    public Object getData() { return data; }
    public String getMessage() { return message; }

    // Setters
    public void setTransactionId(String transactionId) { this.transactionId = transactionId; }
    public void setAgentId(String agentId) { this.agentId = agentId; }
    public void setDigest(String digest) { this.digest = digest; }
    public void setCode(int code) { this.code = code; }
    public void setData(Object data) { this.data = data; }
    public void setMessage(String message) { this.message = message; }
}
