import models.*;
import db.DBCourse;
import db.DBHelper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Runner {

    public static void main(String[] args) {
        SpringApplication.run(Runner.class, args);


        Course course1 = new Course("Software Developer", Qualification.MSC);
        DBHelper.save(course1);
    }
}