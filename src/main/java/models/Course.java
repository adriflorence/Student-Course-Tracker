package models;

import java.util.List;

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
}
