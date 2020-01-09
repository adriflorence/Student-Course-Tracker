package models;

import javax.persistence.*;

@Entity
@Table(name="students")
public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private int age;
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


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    @Column(name="first_name")
    public String getFirstName() {
        return firstName;
    }

    @Column(name="last_name")
    public String getLastName() {
        return lastName;
    }

    @Column(name="age")
    public int getAge() {
        return age;
    }

    @Column(name="enrolment_number")
    public int getEnrolmentNumber() {
        return enrolmentNumber;
    }


}