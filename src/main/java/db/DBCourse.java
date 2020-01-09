package db;

import models.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import java.util.List;

public class DBCourse {

    private static Session session;

    public static List<Student> getAllStudents(Course course) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Student> results = null;
        try {
            results = session.createQuery("select from Student st where st.course =" + course, Student.class).list();
        }
        catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }
}
