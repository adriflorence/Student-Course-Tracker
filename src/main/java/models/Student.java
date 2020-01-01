package models;

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
}