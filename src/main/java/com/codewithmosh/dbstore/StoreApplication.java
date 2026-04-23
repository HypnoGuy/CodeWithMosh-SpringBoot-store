package com.codewithmosh.dbstore;

import com.codewithmosh.dbstore.entities.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        // ApplicationContext context = SpringApplication.run(StoreApplication.class, args);

        var user = User.builder()
            .name("John")
            .password("123")
            .email("steve@example.com")
            .build();

        var category = Category.builder()
            .name("Food")
            .build();

        var product = Product.builder()
            .name("Pizza")
            .price(11.45)
            .category(category)
            .build();

        System.out.println(product);
    }

}
