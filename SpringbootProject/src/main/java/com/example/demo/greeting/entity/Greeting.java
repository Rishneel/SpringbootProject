package com.example.demo.greeting.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MNT_CardTypes")
public class Greeting implements Serializable {
    @Id
    private String CardVersion;
    private String CardCode;
    private String CardType;
    private int Status;

    public String getCardVersion() {
        return CardVersion;
    }

    public String getCardCode() {
        return CardCode;
    }

    public String getCardType() {
        return CardType;
    }

    public int getStatus() {
        return Status;
    }
}
