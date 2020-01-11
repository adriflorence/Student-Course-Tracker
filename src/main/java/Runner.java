import models.*;
import db.DBCourse;
import db.DBHelper;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Course course1 = new Course("Software Development", Qualification.MSC);
        DBHelper.save(course1);

        Student student1 = new Student("Adri", "Florence", 29, 153, course1 );
        DBHelper.save(student1);

        List<Student> allStudents = DBHelper.getAll(Student.class);
        System.out.println(allStudents);
    }
}