package com.xworkz.login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/user")
public class userServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String Username = req.getParameter("Username");
        String password = req.getParameter("password");
        String confirm = req.getParameter("confirm password");

        PrintWriter printWriter = resp.getWriter();
        printWriter.write("Thank you "+ Username +" for logging in");

    }
}
