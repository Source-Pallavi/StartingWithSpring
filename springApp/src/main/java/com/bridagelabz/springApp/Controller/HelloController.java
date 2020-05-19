package com.bridagelabz.springApp.Controller;
import com.bridagelabz.springApp.User;
import org.springframework.web.bind.annotation.*;
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping(value = {"", "/", "/home"})//how my url will work
    public String sayHello() {
        return "Hello Pallavi";
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "firstName") String firstName, @RequestParam(value = "lastName") String lastName) {
        return "Hello" + firstName + " " + lastName + "!";
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello" + name + "!";
    }

    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello" + user.getFirstName() + " " + user.getLastName() + "!";
    }

    @PutMapping("/put/{firstName}")
    public String sayHelloPut(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
        return "Hello" + firstName + " " + lastName + "!";
    }
}