package spring.eclasssystem.entity;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "students")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sname", nullable = false)
    private String name;

    @Column(name = "class")
    private String className;

    @Column(name = "boy")
    private Boolean isMale;

    // One-to-Many relationship with Marks
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Mark> marks;

    // Constructors
    public Student() {}

    public Student(String name, String className, Boolean isMale) {
        this.name = name;
        this.className = className;
        this.isMale = isMale;
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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Boolean getMale() {
        return isMale;
    }

    public void setMale(Boolean male) {
        isMale = male;
    }

    public List<Mark> getMarks() {
        return marks;
    }

    public void setMarks(List<Mark> marks) {
        this.marks = marks;
    }

}
