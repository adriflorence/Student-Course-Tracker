package models;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name="lessons")
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="title")
    private String title;

    @Column(name="classroom")
    private int classroom;
    
    private Calendar date;
    private Course course;
    private Instructor instructor;

    public Lesson(){}

    public Lesson(int id, String title, int classroom, Calendar date, Course course, Instructor instructor) {
        this.id = id;
        this.title = title;
        this.classroom = classroom;
        this.date = date;
        this.course = course;
        this.instructor = instructor;
    }

}
