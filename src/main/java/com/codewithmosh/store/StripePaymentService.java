package com.codewithmosh.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

// @Service("stripe")
public class StripePaymentService implements PaymentService {

    @Value("${stripe.apiUrl}")
    private String  apiURL;

    @Value("${stripe.enabled}")
    private boolean enabled;

    @Value("${stripe.timeout}")
    private int timeout;

    @Value("${stripe.supported-currencies}")
    private List<String> supportedCurrencies;

    @Override
    public void processPayment(double Amount) {
        System.out.println("STRIPE");
        System.out.println("Amount = " + Amount);

        System.out.println("API URL = " + apiURL);
        System.out.println("Enabled = " + enabled);
        System.out.println("Timeout = " + timeout);
        System.out.println("Supported currencies = " + supportedCurrencies);

    }
}
