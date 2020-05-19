package com.bridagelabz.springApp.Interfacess;

import com.bridagelabz.springApp.GreetingUser;
import com.bridagelabz.springApp.User;

import java.util.List;
import java.util.Optional;

public interface GreetingServiceI {
    GreetingUser addGreeting(User user);

    Optional<GreetingUser> getGreetingById(long id);

    List<GreetingUser> getAllGreeting();

    void deleteGreeting(long id);

    void updateGreeting(long id, String name);
}
