package org.example.suleyman.controller;

import org.example.suleyman.model.User;
import org.example.suleyman.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    @Autowired
    private UserService userService;

    // Display register page
    @GetMapping("/register")
    public String showRegisterPage() {
        return "page/Register";
    }

    // Handle user registration
    @PostMapping("/register")
    public String registerUser(User user) {
        if (userService.isEmailExists(user.getEmail())) {
            return "redirect:/register?error=emailExists"; // Error if email already exists
        }

        // Proceed to register the user
        if (userService.registerUser(user)) {
            return "redirect:/login"; // Redirect to login page after successful registration
        } else {
            return "redirect:/register?error=error"; // Redirect to register page with error message
        }
    }

    // Display page for new user (optional additional page)
    @GetMapping("/new-user")
    public String showNewUserPage() {
        return "page/newUser";
    }

    // Handle registration for new user
    @PostMapping("/new-user")
    public String newUser(User user) {
        if (userService.isEmailExists(user.getEmail())) {
            return "redirect:/new-user?error=emailExists"; // Error if email already exists
        }

        // Proceed to register the new user
        if (userService.registerUser(user)) {
            return "redirect:/home"; // Redirect to home after successful registration
        } else {
            return "redirect:/new-user?error=error"; // Error if registration fails
        }
    }
}
