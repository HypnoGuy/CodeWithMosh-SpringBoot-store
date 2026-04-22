package com.codewithmosh.dbstore;

import com.codewithmosh.dbstore.entities.Address;
import com.codewithmosh.dbstore.entities.Tag;
import com.codewithmosh.dbstore.entities.User;
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

        var tag = new Tag("tag1");
        user.getTags().add(tag);
        tag.getUsers().add(user);

        System.out.println(user);
    }

}
