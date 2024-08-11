package com.store.ecommerce.dto;

import lombok.Data;

@Data
public class PaymentInfo {

    // stripe uses the lowest denomination of currency so cent
    private int amount;
    private String currency;
    private String receiptEmail;
}
