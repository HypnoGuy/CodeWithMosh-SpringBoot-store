package com.codewithmosh.userreg;

import org.springframework.stereotype.Service;

@Service
public class EmailNotificationService implements NotificationService {
    @Override
    public void send(String message, String recipientEmail) {
        System.out.println("Pretending to send message '" + message + "' to recipient '" + recipientEmail + "'");
    }
}
