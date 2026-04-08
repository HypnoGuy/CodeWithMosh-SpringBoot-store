package com.codewithmosh.userreg;

public interface UserRepository {
    void save(User user);

    User findByEmail(String email);
}
