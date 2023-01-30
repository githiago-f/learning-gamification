package org.example.demo.core.scholar.students;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.example.demo.core.gamification.Score;

@Getter @Setter
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    @Embedded
    private final Score score;

    public Student() {
        this(null, new Score());
    }

    public Student(String name, Score score) {
        this.name = name;
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
