package com.codewithmosh.store;

import org.springframework.stereotype.Service;

// @Service("paypal")
public class PayPalPaymentService implements PaymentService {
    @Override
    public void processPayment(double Amount) {
        System.out.println("PAYPAL");
        System.out.println("Amount = " + Amount);
    }
}
