package org.example.suleyman.controller;

import org.example.suleyman.dao.*;
import org.example.suleyman.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private StudentManager studentManager;
    @Autowired
    private ContactMessageManager contactMessageManager;

    @Autowired
    private MarksManager marksManager;

    @Autowired
    private SubjectManager subjectManager;
    @Autowired
    private UserManager userManager;
   


    public HomeController() {
    }

    // Constructor for testing or specific injection scenarios
    public HomeController(StudentManager studentManager) {
        this.studentManager = studentManager;
    }

    @GetMapping("/") // Home page
    public String home(Model model) {
        // Fetch all students
        List<Student> students = studentManager.getAll();

        model.addAttribute("students", students);

        return "page/Home";
    }

    @GetMapping("/contact")
    public String contact() {
        return "page/contact";
    }

    @PostMapping("/contact") // Handle form submission
    public String handleContactForm(@RequestParam("name") String name,
                                    @RequestParam("email") String email,
                                    @RequestParam("message") String message,
                                    Model model) {
        // Validate inputs here (e.g., check for empty fields, valid email, etc.)
        if (name.isEmpty() || email.isEmpty() || message.isEmpty()) {
            model.addAttribute("error", "All fields are required.");
            return "page/contact";
        }

        ContactMessage contactMessage = new ContactMessage(name, email, message);
        contactMessageManager.saveMessage(contactMessage);

        model.addAttribute("success", "Your message has been sent successfully.");
        return "page/contact";
    }

    @GetMapping("/home") // Dashboard page
    public String dashboard(Model model) {
        // Fetch data from DAOs
        List<Student> students = studentManager.getAll();
        List<Marks> marks = marksManager.getAll();
        List<Subject> subjects = subjectManager.getAll();
        List<User> users = userManager.getAll();

        model.addAttribute("students", students);
        model.addAttribute("marks", marks);
        model.addAttribute("courses", subjects);
        model.addAttribute("users", users);

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.isAuthenticated()) {
            String username = authentication.getName();
            String role = authentication.getAuthorities().stream()
                    .map(GrantedAuthority::getAuthority)
                    .findFirst()
                    .orElse(null);

            System.out.println("Username: " + username);
            model.addAttribute("username", username);
            model.addAttribute("role", role);
        } else {
            System.out.println("No authenticated user");
        }

        return "page/dashboard";
    }

    @GetMapping("/about")
    public String about() {
        return "page/about";
    }

    @GetMapping("/insert")
    public String insert(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.isAuthenticated()) {
            String username = authentication.getName();
            String role = authentication.getAuthorities().stream()
                    .map(GrantedAuthority::getAuthority)
                    .findFirst()
                    .orElse(null);

            System.out.println("Username: " + username);
            model.addAttribute("username", username);
            model.addAttribute("role", role);
        } else {
            System.out.println("No authenticated user");
        }
        return "page/insert";
    }

    @GetMapping("/message")
    public String messages(Model model) {
        List<ContactMessage> contactMessages = contactMessageManager.getAll();

        model.addAttribute("contactMessages", contactMessages);
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.isAuthenticated()) {
            String username = authentication.getName();
            String role = authentication.getAuthorities().stream()
                    .map(GrantedAuthority::getAuthority)
                    .findFirst()
                    .orElse(null);

            System.out.println("Username: " + username);
            model.addAttribute("username", username);
            model.addAttribute("role", role);
        } else {
            System.out.println("No authenticated user");
        }
        return "page/messages";
    }
}