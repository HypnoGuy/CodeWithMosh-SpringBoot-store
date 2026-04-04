package com.codewithmosh.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Value("${payment-gateway}")
    private String paymentGateway;

    @Bean
    public PaymentService stripe() {
        return new StripePaymentService();
    }

    @Bean
    public PaymentService paypal() {
        return new PayPalPaymentService();
    }

    @Bean
    // @Scope("prototype")
    public OrderService orderService() {

        OrderService newOrderService;

        if ( paymentGateway.equals("stripe") )
            newOrderService = new OrderService(stripe());
        else
            newOrderService = new OrderService(paypal());

        return newOrderService;
    }
}
