package org.example.demo.core.gamification;

import org.example.demo.core.scholar.lessons.Lesson;
import org.example.demo.core.scholar.students.Student;

public class Progress {
    private final Student student;
    private final Lesson lesson;
    private Double percent;

    public Progress(Student student, Lesson lesson) {
        this.student = student;
        this.lesson = lesson;
        this.percent = 0d;
    }

    public Student getStudent() {
        return student;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }
}
