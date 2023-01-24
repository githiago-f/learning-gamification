package org.example.demo.core.scholar.students;

import org.example.demo.core.gamification.Score;
import org.example.demo.core.scholar.students.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentsService {
    public Student create() {
        return new Student("Student name", new Score());
    }
}
