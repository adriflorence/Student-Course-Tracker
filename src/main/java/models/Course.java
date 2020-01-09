package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="courses")
public class Course {

    private int id;
    private String title;
    private Qualification qualification;
    private List<Student> students;
    private List<Lesson> lessons;

    public Course(){}

    public Course(String title, Qualification qualification) {
        this.title = title;
        this.qualification = qualification;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    @Column(name="title")
    public String getTitle() {
        return title;
    }

    @Enumerated(value = EnumType.STRING)
    public Qualification getQualification() {
        return qualification;
    }

    // FetchType.EAGER: fetching gets all the relationships for given course (uses a lot of memory)
    // mappedBy: points back to Student class' course instance variable
    @OneToMany(mappedBy = "course", fetch = FetchType.LAZY)
    public List<Student> getStudents() {
        return students;
    }

    @OneToMany(mappedBy = "course", fetch = FetchType.LAZY)
    public List<Lesson> getLessons() {
        return lessons;
    }
}
