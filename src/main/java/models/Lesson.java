package models;

import java.util.Calendar;

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

}
