package org.example.demo.core.gamification;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.example.demo.core.scholar.lessons.Lesson;
import org.example.demo.core.scholar.students.Student;

@Data
@RequiredArgsConstructor
public class Progress {
    private final Student student;
    private final Lesson lesson;
    private Double percent;
}
