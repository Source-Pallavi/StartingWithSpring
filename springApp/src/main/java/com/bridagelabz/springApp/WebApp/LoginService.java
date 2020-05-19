package com.bridagelabz.springApp.WebApp;

public class LoginService {
    public boolean validateUser(String name, String password)
    {
        return name.equalsIgnoreCase("pallavi")&&password.equals("9876");
    }
}
