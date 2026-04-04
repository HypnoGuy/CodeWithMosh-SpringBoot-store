package com.codewithmosh.message;

import com.codewithmosh.store.StoreApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class NotificationApplication

{
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(NotificationApplication.class, args);
        var notificationManager = context.getBean(NotificationManager.class);
        notificationManager.sendMessage("Hello Steve");
    }

}
