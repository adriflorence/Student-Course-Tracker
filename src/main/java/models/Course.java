package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="title")
    private String title;

    @Column(name="qualification")
    private Qualification qualification;


    private List<Student> students;
    private List<Lesson> lessons;

    public Course(){}

    public Course(String title, Qualification qualification) {
        this.title = title;
        this.qualification = qualification;
    }
}
