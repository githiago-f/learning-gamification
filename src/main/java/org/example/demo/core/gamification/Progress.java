package org.example.demo.core.gamification;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import lombok.*;
import org.example.demo.core.scholar.lessons.Lesson;
import org.example.demo.core.gamification.vo.ProgressId;
import org.example.demo.core.scholar.students.Student;

@Entity
@Getter
@IdClass(ProgressId.class)
public class Progress {
    @EmbeddedId
    private ProgressId id;

    @Id
    @ManyToOne(optional = false)
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @Id
    @ManyToOne(optional = false)
    @JoinColumn(name = "lesson_id", nullable = false)
    private final Lesson lesson;

    @DecimalMin("0.0")
    @DecimalMax("100.0")
    private Double percent;

    public void setStudent(Student student) {
        this.student = student;
    }

    public Progress() {
        this(null, null);
    }
    public Progress(Student student, Lesson lesson) {
        this.student = student;
        this.lesson = lesson;
        this.percent = 0.0;
    }

    public void addPercent(Double percent) {
        this.percent += percent;
    }
}
