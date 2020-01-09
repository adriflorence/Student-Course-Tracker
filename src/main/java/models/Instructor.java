package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "instructors")
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    private List<Lesson> lessons;

    public Instructor() {
    }

    public Instructor(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public int getId() {
        return id;
    }

    @Column(name="name")
    public String getName() {
        return name;
    }

    @OneToMany(mappedBy = "instructor", fetch = FetchType.LAZY)
    public List<Lesson> getLessons() {
        return lessons;
    }
}
