package com.codewithmosh.userreg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UserRegApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(UserRegApplication.class, args);

        var userService = context.getBean(UserService.class);
        userService.RegisterUser(new User(1, "user@somewhere.com", "273hd3yu", "Steve" ));
    }
}
