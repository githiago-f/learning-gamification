package org.example.demo.core.service;

import org.example.demo.app.aspect.LogResult;
import org.example.demo.core.gamification.Progress;
import org.example.demo.core.gamification.repository.ProgressRepository;
import org.example.demo.core.scholar.lessons.Lesson;
import org.example.demo.core.scholar.lessons.in.LessonIn;
import org.example.demo.core.scholar.lessons.repository.LessonRepository;
import org.example.demo.core.scholar.students.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LessonsService {
    private final LessonRepository lessonRepository;
    private final ProgressRepository progressRepository;

    @Autowired
    public LessonsService(LessonRepository lessonRepository, ProgressRepository progressRepository) {
        this.lessonRepository = lessonRepository;
        this.progressRepository = progressRepository;
    }

    public Lesson createLesson(LessonIn lessonIn) {
        Lesson lesson = lessonIn.asEntity();
        return lessonRepository.save(lesson);
    }

    @LogResult
    public Optional<Progress> start(Student student, Long lessonId) {
        Optional<Lesson> lesson = this.lessonRepository.findById(lessonId);
        return lesson.map(val -> {
            Progress progress = new Progress(student, val);
            return this.progressRepository.save(progress);
        });
    }

    @LogResult
    public Optional<Progress> updateProgress(Student student, Long lessonId, Double percent) {
        Optional<Progress> progress = progressRepository.findByStudentAndLesson_Id(student, lessonId);
        return progress.map(val -> {
            val.addPercent(percent);
            return progressRepository.save(val);
        });
    }
}
