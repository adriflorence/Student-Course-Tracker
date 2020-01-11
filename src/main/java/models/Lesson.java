package models;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name="lessons")
public class Lesson {

    private int id;
    private String title;
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

    @Column(name="classroom_number")
    public int getClassroom() {
        return classroom;
    }

    @Column(name = "date")
    public Calendar getDate() {
        return date;
    }

    @ManyToOne
    @JoinColumn(name="course_id", nullable = false)
    public Course getCourse() {
        return course;
    }

    @ManyToOne
    @JoinColumn(name = "instructor_id", nullable = false)
    public Instructor getInstructor() {
        return instructor;
    }

    // SETTERS
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
}
