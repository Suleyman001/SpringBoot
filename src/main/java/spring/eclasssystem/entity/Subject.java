package spring.eclasssystem.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "subjects")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sname", nullable = false)
    private String name;

    @Column(name = "category")
    private String category;

    // One-to-Many relationship with Marks
    @OneToMany(mappedBy = "subject", cascade = CascadeType.ALL)
    private List<Mark> marks;

    // Constructors
    public Subject() {}

    public Subject(String name, String category) {
        this.name = name;
        this.category = category;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Mark> getMarks() {
        return marks;
    }

    public void setMarks(List<Mark> marks) {
        this.marks = marks;
    }
}