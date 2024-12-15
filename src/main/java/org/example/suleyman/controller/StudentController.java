package org.example.suleyman.controller;

import org.example.suleyman.dao.StudentManager;
import org.example.suleyman.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    @Autowired
    private StudentManager studentManager;

    @GetMapping("/add-student")
    public String showAddStudentForm(Model model) {
        model.addAttribute("student", new Student()); // Create an empty student object
        return "AddStudent";
    }

    @PostMapping("/add-student")
    public String addStudent(
            @RequestParam String name,
            @RequestParam String age,
            @RequestParam String gender,
            Model model) {

        Student student = new Student(name, Integer.parseInt(age), gender);
        studentManager.addStudent(student);
        model.addAttribute("message", "Student added successfully!");
        return "redirect:/home";
    }

    @GetMapping("/update-student/{id}")
    public String showUpdateStudentForm(@PathVariable long id, Model model) {
        Student student = studentManager.getStudentById(id);
        model.addAttribute("student", student);
        return "UpdateStudent"; // View for updating student
    }

    @PostMapping("/update-student/{id}")
    public String updateStudent(
            @PathVariable long id,
            @RequestParam String name,
            @RequestParam String age,
            @RequestParam String gender,
            Model model) {

        Student student = new Student(id, name, Integer.parseInt(age), gender);
        studentManager.updateStudent(student);
        model.addAttribute("message", "Student updated successfully!");
        return "redirect:/home";
    }

    @GetMapping("/delete-student/{id}")
    public String deleteStudent(@PathVariable long id, Model model) {
        studentManager.deleteStudent(id);
        model.addAttribute("message", "Student deleted successfully!");
        return "redirect:/home";
    }
}
