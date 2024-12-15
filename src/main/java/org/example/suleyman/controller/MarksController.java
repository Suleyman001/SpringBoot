package org.example.suleyman.controller;

import org.example.suleyman.dao.MarksManager;
import org.example.suleyman.model.Marks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping("/marks")
public class MarksController {

    @Autowired
    private MarksManager marksManager;

    // Get all marks
    @GetMapping("/")
    public List<Marks> getAllMarks() {
        return marksManager.getAll();
    }

    // Get mark by ID
    @GetMapping("/{id}")
    public Marks getMarkById(@PathVariable Long id) {
        return marksManager.getMarkById(id);
    }

    // Add new mark
    @PostMapping("/")
    public void addMark(@RequestBody Marks marks) {
        marksManager.addMark(marks); // Fixing method name to match MarksManager's addMark
    }

    // Update existing mark
    @PutMapping("/{id}")
    public void updateMark(@PathVariable Long id, @RequestBody Marks marks) {
        marks.setId(id);  // Ensure the mark ID is set when updating
        marksManager.updateMark(marks); // Fixing method name to match MarksManager's updateMark
    }

    // Delete mark by ID
    @DeleteMapping("/{id}")
    public void deleteMark(@PathVariable Long id) {
        marksManager.deleteMark(id); // Fixing method name to match MarksManager's deleteMark
    }
}
