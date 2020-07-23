package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO: show the registration form
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // TODO: ensure the submitted information is valid
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        boolean invalidEntry = username.isEmpty() || email.isEmpty() || password.isEmpty();

        if(invalidEntry) {
            request.setAttribute("fieldsMissing", true);
            request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
        } else if (DaoFactory.getUsersDao().findByUsername(username) != null){
            request.setAttribute("invalidUsername", true);
            request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
        } else {
            User newUser = new User (username, email, password);
            DaoFactory.getUsersDao().insert(newUser);
            response.sendRedirect("/profile");
        }

        // TODO: create a new user based off of the submitted information
        // TODO: if a user was successfully created, send them to their profile
    }
}
