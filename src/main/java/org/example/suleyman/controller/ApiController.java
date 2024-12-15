package org.example.suleyman.controller;

import org.example.suleyman.dao.MarksManager;
import org.example.suleyman.dao.StudentManager;
import org.example.suleyman.dao.SubjectManager;
import org.example.suleyman.dao.UserManager;
import org.example.suleyman.model.Marks;
import org.example.suleyman.model.Student;
import org.example.suleyman.model.Subject;
import org.example.suleyman.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private MarksManager marksManager;

    @Autowired
    private StudentManager studentManager;

    @Autowired
    private SubjectManager subjectManager;

    @Autowired
    private UserManager userManager;

    // --------------------- Endpoints for Marks ---------------------

    @GetMapping("/marks")
    public List<Marks> getAllMarks() {
        return marksManager.getAll();
    }

    @GetMapping("/marks/{id}")
    public ResponseEntity<Marks> getMarksById(@PathVariable Long id) {
        Marks marks = marksManager.getMarkById(id);  // Corrected method name
        return marks != null ? ResponseEntity.ok(marks) : ResponseEntity.notFound().build();
    }

    @PostMapping("/marks")
    public ResponseEntity<Marks> createMarks(@RequestBody Marks marks) {
        marksManager.addMark(marks);  // Corrected method name
        return ResponseEntity.status(HttpStatus.CREATED).body(marks);
    }

    @PutMapping("/marks/{id}")
    public ResponseEntity<Marks> updateMarks(@PathVariable Long id, @RequestBody Marks updatedMarks) {
        Marks marks = marksManager.getMarkById(id);  // Corrected method name
        if (marks != null) {
            marks.setMark(updatedMarks.getMark());  // Use correct setter for mark
            marks.setType(updatedMarks.getType());  // Use correct setter for type
            marks.setStudentId(updatedMarks.getStudentId());  // Update other fields as necessary
            marks.setSubjectId(updatedMarks.getSubjectId());
            marks.setMdate(updatedMarks.getMdate());

            marksManager.updateMark(marks);  // Corrected method name
            return ResponseEntity.ok(marks);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/marks/{id}")
    public ResponseEntity<Void> deleteMarks(@PathVariable Long id) {
        Marks marks = marksManager.getMarkById(id);  // Corrected method name
        if (marks != null) {
            marksManager.deleteMark(id);  // Corrected method name
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    // --------------------- Endpoints for Students ---------------------

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentManager.getAll();
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
        Student student = studentManager.getStudentById(id);
        return student != null ? ResponseEntity.ok(student) : ResponseEntity.notFound().build();
    }

    @PostMapping("/students")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        studentManager.addStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(student);
    }

    @PutMapping("/students/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student updatedStudent) {
        Student student = studentManager.getStudentById(id);
        if (student != null) {
            student.setName(updatedStudent.getName());
            student.setAge(updatedStudent.getAge());
            student.setGrade(updatedStudent.getGrade());
            studentManager.updateStudent(student);
            return ResponseEntity.ok(student);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/students/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        Student student = studentManager.getStudentById(id);
        if (student != null) {
            studentManager.deleteStudent(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    // --------------------- Endpoints for Subjects ---------------------

    @GetMapping("/subjects")
    public List<Subject> getAllSubjects() {
        return subjectManager.getAll();
    }

    @GetMapping("/subjects/{id}")
    public ResponseEntity<Subject> getSubjectById(@PathVariable int id) {
        Subject subject = subjectManager.getSubjectById(id);
        return subject != null ? ResponseEntity.ok(subject) : ResponseEntity.notFound().build();
    }

    @PostMapping("/subjects")
    public ResponseEntity<Subject> createSubject(@RequestBody Subject subject) {
        subjectManager.addSubject(subject);
        return ResponseEntity.status(HttpStatus.CREATED).body(subject);
    }

    @PutMapping("/subjects/{id}")
    public ResponseEntity<Subject> updateSubject(@PathVariable int id, @RequestBody Subject updatedSubject) {
        Subject subject = subjectManager.getSubjectById(id);
        if (subject != null) {
            subject.setSname(updatedSubject.getSname());
            subject.setCategory(updatedSubject.getCategory());
            subjectManager.updateSubject(subject);
            return ResponseEntity.ok(subject);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/subjects/{id}")
    public ResponseEntity<Void> deleteSubject(@PathVariable int id) {
        Subject subject = subjectManager.getSubjectById(id);
        if (subject != null) {
            subjectManager.deleteSubject(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    // --------------------- Endpoints for Users ---------------------

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userManager.getAll();
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        User user = userManager.getUserById(id);
        return user != null ? ResponseEntity.ok(user) : ResponseEntity.notFound().build();
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        userManager.addUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
