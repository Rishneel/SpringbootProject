package com.example.demo.redeemapiconsume;
public class RedeemApiException extends RuntimeException {
    
    public RedeemApiException(String message) {
        super(message);
    }
    
    public RedeemApiException(String message, Throwable cause) {
        super(message, cause);
    }
}