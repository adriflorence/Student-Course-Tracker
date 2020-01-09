package models;

import javax.persistence.*;

@Entity
@Table(name="students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="age")
    private int age;

    @Column(name="enrolment_number")
    private int enrolmentNumber;

    private Course course;

    public Student(){}

    public Student(int id, String firstName, String lastName, int age, int enrolmentNumber, Course course) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.enrolmentNumber = enrolmentNumber;
        this.course = course;
    }
}