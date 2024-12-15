package spring.eclasssystem.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "marks")
public class Mark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "mdate")
    private LocalDate markDate;

    @Column(name = "mark")
    private Integer markValue;

    @Column(name = "type")
    private String markType;

    // Many-to-One relationship with Student
    @ManyToOne
    @JoinColumn(name = "studentid", nullable = false)
    private Student student;

    // Many-to-One relationship with Subject
    @ManyToOne
    @JoinColumn(name = "subjectid", nullable = false)
    private Subject subject;

    // Constructors
    public Mark() {}

    public Mark(LocalDate markDate, Integer markValue, String markType, Student student, Subject subject) {
        this.markDate = markDate;
        this.markValue = markValue;
        this.markType = markType;
        this.student = student;
        this.subject = subject;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getMarkDate() {
        return markDate;
    }

    public void setMarkDate(LocalDate markDate) {
        this.markDate = markDate;
    }

    public Integer getMarkValue() {
        return markValue;
    }

    public void setMarkValue(Integer markValue) {
        this.markValue = markValue;
    }

    public String getMarkType() {
        return markType;
    }

    public void setMarkType(String markType) {
        this.markType = markType;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}