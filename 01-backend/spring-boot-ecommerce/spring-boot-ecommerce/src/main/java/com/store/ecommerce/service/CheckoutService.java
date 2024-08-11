package com.store.ecommerce.service;

import com.store.ecommerce.dto.PaymentInfo;
import com.store.ecommerce.dto.Purchase;
import com.store.ecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
