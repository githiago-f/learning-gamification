package org.example.demo.core.scholar.lessons;

import jakarta.persistence.EntityManager;
import org.example.demo.core.gamification.Progress;
import org.example.demo.core.scholar.lessons.in.LessonIn;
import org.example.demo.core.scholar.lessons.repository.LessonRepository;
import org.example.demo.core.scholar.students.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonsService {
    private final LessonRepository lessonRepository;

    @Autowired
    public LessonsService(LessonRepository lessonRepository) {
        this.lessonRepository = lessonRepository;
    }

    public Lesson createLesson(LessonIn lessonIn) {
        Lesson lesson = lessonIn.asEntity();
        return lessonRepository.save(lesson);
    }

    public Progress start(Student student, Lesson lesson) {
        return new Progress(student, lesson);
    }
}
