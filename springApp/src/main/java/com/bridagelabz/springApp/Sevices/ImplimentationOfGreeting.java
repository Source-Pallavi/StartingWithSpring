package com.bridagelabz.springApp.Sevices;

import com.bridagelabz.springApp.GreetingUser;
import com.bridagelabz.springApp.Interfacess.GreetingRepo;
import com.bridagelabz.springApp.Interfacess.GreetingServiceI;
import com.bridagelabz.springApp.User;

import java.util.List;
import java.util.Optional;

public class ImplimentationOfGreeting implements GreetingServiceI {
    GreetingRepo greetingRepo;
    @Override
    public GreetingUser addGreeting(User user) {
        return greetingRepo.save(new GreetingUser(counter.incrementAndGet(),message));
    }

    @Override
    public Optional<GreetingUser> getGreetingById(long id) {
        return greetingRepo.findById(id);
    }

    @Override
    public List<GreetingUser> getAllGreeting() {
        return greetingRepo.findAll();
    }

    @Override
    public void deleteGreeting(long id) {
        return greetingRepo.findAll();
    }

    @Override
    public void updateGreeting(long id, String name) {
        greetingRepo.deleteById(id);
    }
}
