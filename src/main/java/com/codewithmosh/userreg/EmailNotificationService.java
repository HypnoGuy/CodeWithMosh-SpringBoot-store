package com.codewithmosh.userreg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EmailNotificationService implements NotificationService {

    @Value("${email-server.host}")
    String host;

    @Value("${email-server.port}")
    String port;

    @Override
    public void send(String message, String recipientEmail) {
        System.out.println("Pretending to send message '" + message + "' to recipient '" + recipientEmail + "'");
        System.out.println("Using " + host + ":" + port);
    }
}
