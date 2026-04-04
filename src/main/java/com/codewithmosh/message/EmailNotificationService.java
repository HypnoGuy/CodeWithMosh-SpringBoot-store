package com.codewithmosh.message;

import org.springframework.stereotype.Service;

@Service("email")
public class EmailNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("EMAIL message = " + message);
    }
}
