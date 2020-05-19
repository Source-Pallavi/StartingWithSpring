package com.bridagelabz.springApp;

import org.springframework.boot.web.servlet.ServletRegistrationBean;

import javax.servlet.annotation.WebServlet;

public class AppConf {
    ServletRegistrationBean h2servletRegistrationdataBase() {
        ServletRegistrationBean registrationBean;
        registrationBean = new ServletRegistrationBean(new WebServlet());
        registrationBean.addUrlMappings("/console/*");
        return registrationBean;
    }
}