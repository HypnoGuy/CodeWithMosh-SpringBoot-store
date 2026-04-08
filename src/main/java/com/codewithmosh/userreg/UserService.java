package com.codewithmosh.userreg;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final NotificationService notificationService;

    public UserService(UserRepository userRepository, NotificationService notificationService) {
        this.userRepository = userRepository;
        this.notificationService = notificationService;
    }

    public void RegisterUser(User user) {
        userRepository.save(user);
        notificationService.send("You are registered " + user.getName() , user.getEmail());
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

}
