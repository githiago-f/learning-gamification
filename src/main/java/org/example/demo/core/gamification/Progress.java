package org.example.demo.core.gamification;

import org.example.demo.core.schoolar.lessons.Module;
import org.example.demo.core.schoolar.students.Student;

public class Progress {
    private final Student student;
    private final Module module;
    private ProgressState state;
    private Double percent;

    public Progress() {
        this(null, null, ProgressState.STARTED, 0.0);
    }

    public Progress(Student student, Module module, ProgressState state, Double percent) {
        this.student = student;
        this.module = module;
        this.state = state;
        this.percent = percent;
    }

    public Student getStudent() {
        return student;
    }

    public Module getModule() {
        return module;
    }

    public ProgressState getState() {
        return state;
    }

    public void setState(ProgressState state) {
        this.state = state;
    }

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }
}
