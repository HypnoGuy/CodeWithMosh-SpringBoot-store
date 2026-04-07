package com.codewithmosh.userreg;

public class User {

        private long id;
    private String email;
    private String password;
    private String name;

    User(long id, String email, String password, String name) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

}
