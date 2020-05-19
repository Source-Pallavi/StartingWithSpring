package com.bridagelabz.springApp;

import javax.persistence.Entity;

@Entity
@Table(name = "Greetings")
public class GreetingUser {
    @Id
    private final long id;
    private String message;


    public GreetingUser(long id, String message) {
        this.id = id;
        this.message = message;
    }

    public GreetingUser() {
        id = 0;
        message = "";
    }

    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
