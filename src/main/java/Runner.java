import models.*;
import db.DBCourse;
import db.DBHelper;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Course course1 = new Course("Software Developer", Qualification.MSC);
        DBHelper.save(course1);

        List<Student> allStudents = DBHelper.getAll(Student.class);
    }
}