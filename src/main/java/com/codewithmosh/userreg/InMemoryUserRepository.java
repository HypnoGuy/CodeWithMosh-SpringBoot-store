package com.codewithmosh.userreg;

import java.util.HashMap;

public class InMemoryUserRepository implements UserRepository {

    private HashMap<String, User> users = new HashMap<String, User>();

    @Override
    public void save(User user) {
        users.put(user.getEmail(),user);
    }
}
