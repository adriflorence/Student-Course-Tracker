package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "instructors")
public class Instructor {

    private int id;
    private String name;
    private List<Lesson> lessons;

    public Instructor() {
    }

    public Instructor(String name) {
        this.name = name;
    }

    // GETTERS
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    public int getId() {
        return id;
    }

    @Column(name="name")
    public String getName() {
        return name;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "instructor", fetch = FetchType.LAZY)
    public List<Lesson> getLessons() {
        return lessons;
    }

    // SETTERS
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }
}
