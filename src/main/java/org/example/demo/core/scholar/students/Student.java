package org.example.demo.core.scholar.students;

import org.example.demo.core.gamification.Score;

public class Student {
    private String name;
    private final Score score;

    public Student(String name, Score score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Score getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
