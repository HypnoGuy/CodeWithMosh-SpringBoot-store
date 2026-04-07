package com.codewithmosh.userreg;

public class UserService {

    private UserRepository userRepository;
    private NotificationService notificationService;

    public void RegisterUser(User user) {
        userRepository.save(user);
        notificationService.send("You are registered " + user.getName() , user.getEmail());
    }

}
