package com.codewithmosh.userreg;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class InMemoryUserRepository implements UserRepository {

    private HashMap<String, User> users = new HashMap<String, User>();

    @Override
    public void save(User user) {
        users.put(user.getEmail(),user);
    }

    @Override
    public User findByEmail(String email) {
        return users.get(email);
    }
}
