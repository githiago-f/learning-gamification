package org.example.demo.core.service;

import org.example.demo.core.gamification.Score;
import org.example.demo.core.scholar.students.Student;
import org.example.demo.core.scholar.students.in.StudentIn;
import org.example.demo.core.scholar.students.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentsService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentsService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student create(StudentIn studentIn) {
        return studentRepository.save(studentIn.asEntity());
    }
}
