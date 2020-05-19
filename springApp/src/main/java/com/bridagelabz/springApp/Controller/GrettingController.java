package com.bridagelabz.springApp.Controller;

import com.bridagelabz.springApp.GreetingUser;
import com.bridagelabz.springApp.Interfacess.GreetingServiceI;
import com.bridagelabz.springApp.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/greeting")
public class GrettingController
{
    @Autowired
    private GreetingServiceI greetingService;


    @PostMapping("/post")
    public GreetingUser greeting(@RequestParam String name) {
        User user = new User();
        user.setFirstName(name);
        return greetingService.addGreeting(user);
    }

    @GetMapping("/getGreeting/{id}")
    public Optional<GreetingUser> findGreetingById(@PathVariable(value = "id") long id) {
        Optional<GreetingUser> greetingById = greetingService.getGreetingById(id);
        return  greetingById;
    }
    @GetMapping("/getAllGreetings")
    public List<GreetingUser> getAllGreetingById() {
        return greetingService.getAllGreeting();
    }
    @DeleteMapping("/deleteGreeting/{id}")
    public String deleteById(@PathVariable long id){
        greetingService.deleteGreeting(id);
        return "Greeting Deleted successfully";
    }

    @PutMapping("/updateGreetings/{id}")
    public String updateGreetingById(@PathVariable long id, @RequestParam String name ){
        greetingService.updateGreeting(id, name);
        return "Greeting Updated!!!!";
    }
}
