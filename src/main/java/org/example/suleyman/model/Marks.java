package org.example.suleyman.model;

import java.sql.Date;

public class Marks {
    private Long id;           // Assuming Long for ID
    private int studentId;     // Changed to int for consistency
    private Date mdate;
    private int mark;
    private String type;
    private int subjectId;     // Changed to int for consistency

    // Constructor
    public Marks(Long id, int studentId, Date mdate, int mark, String type, int subjectId) {
        this.id = id;
        this.studentId = studentId;
        this.mdate = mdate;
        this.mark = mark;
        this.type = type;
        this.subjectId = subjectId;
    }

    // Getter and Setter for id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and Setter for studentId (assuming it's int)
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    // Getter and Setter for mdate
    public Date getMdate() {
        return mdate;
    }

    public void setMdate(Date mdate) {
        this.mdate = mdate;
    }

    // Getter and Setter for mark
    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    // Getter and Setter for type
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Getter and Setter for subjectId
    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }
}
