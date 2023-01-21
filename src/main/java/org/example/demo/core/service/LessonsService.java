package org.example.demo.core.service;

import org.example.demo.core.gamification.Progress;
import org.example.demo.core.scholar.lessons.Lesson;
import org.example.demo.core.scholar.lessons.Module;
import org.example.demo.core.scholar.students.Student;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class LessonsService {
    public Module createModule() {
        // TODO
        return new Module("Example module");
    }

    public Lesson createLesson() {
        // TODO
        return new Lesson(
                "lesson-example",
                "lesson example",
                "Lesson example for consuming",
                new HashSet<>(),
                Short.parseShort("2")
        );
    }

    public Module addLesson(Module module, Lesson lesson) {
        // TODO
        module.addLesson(lesson);
        return module;
    }

    public Progress start(Student student, Lesson lesson) {
        // TODO
        return new Progress(student, lesson);
    }
}
