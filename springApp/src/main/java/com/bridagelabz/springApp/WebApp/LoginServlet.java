package com.bridagelabz.springApp.WebApp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
    private LoginService service= new LoginService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
       request.getRequestDispatcher("/WEB_INF/views/login.jsp").forward(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
    {
        String name =request.getParameter("name");
        String password =request.getParameter("password");
        boolean isValidUser=service.validateUser(name,password);
        if(isValidUser) {
            request.setAttribute("name", name);
            request.getRequestDispatcher("/WEB_INF/views/welcome.jsp").forward(request,response);
        }
        else
            request.setAttribute("errorMessage","Invalid Credential!!!");
        request.getRequestDispatcher("/WEB_INF/views/login.jsp").forward(request,response);

    }

}
