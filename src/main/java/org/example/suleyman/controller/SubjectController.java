package org.example.suleyman.controller;

import org.example.suleyman.dao.SubjectManager;
import org.example.suleyman.model.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/subjects")
public class SubjectController {

    @Autowired
    private SubjectManager subjectManager;

    // Get all subjects
    @GetMapping
    public String getAllSubjects(Model model) {
        List<Subject> subjects = subjectManager.getAll();
        model.addAttribute("subjects", subjects);
        return "ListSubjects"; // Template to list subjects
    }

    // Show form to add a new subject
    @GetMapping("/add")
    public String showAddSubjectForm(Model model) {
        model.addAttribute("subject", new Subject(0, "", "")); // Initialize with empty data
        return "AddSubject"; // Template to add a subject
    }

    // Add new subject
    @PostMapping("/add")
    public String addSubject(@ModelAttribute Subject subject) {
        subjectManager.addSubject(subject); // Save the new subject
        return "redirect:/subjects"; // Redirect to list page
    }

    // Show form to edit an existing subject
    @GetMapping("/edit/{id}")
    public String showEditSubjectForm(@PathVariable int id, Model model) {
        Subject subject = subjectManager.getSubjectById(id); // Fetch the subject by id
        model.addAttribute("subject", subject); // Add subject to the model
        return "EditSubject"; // Template to edit subject
    }

    // Update the subject
    @PostMapping("/edit")
    public String updateSubject(@ModelAttribute Subject subject) {
        subjectManager.updateSubject(subject); // Update the subject
        return "redirect:/subjects"; // Redirect to list page
    }

    // Delete a subject
    @GetMapping("/delete/{id}")
    public String deleteSubject(@PathVariable int id) {
        subjectManager.deleteSubject(id); // Delete the subject
        return "redirect:/subjects"; // Redirect to list page
    }
}
