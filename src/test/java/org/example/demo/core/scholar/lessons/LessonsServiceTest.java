package org.example.demo.core.scholar.service;

import org.example.demo.core.gamification.Progress;
import org.example.demo.core.scholar.lessons.Lesson;
import org.example.demo.core.scholar.lessons.in.LessonIn;
import org.example.demo.core.scholar.students.in.StudentIn;
import org.example.demo.core.service.LessonsService;
import org.example.demo.core.scholar.students.Student;
import org.example.demo.core.service.StudentsService;
import org.junit.jupiter.api.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RunWith(SpringRunner.class)
class LessonsServiceTest {
    @Autowired
    private LessonsService lessonsService;

    @Autowired
    private StudentsService studentsService;

    private final LessonIn inputLesson = LessonIn.builder()
            .title("Example lesson")
            .description("Lesson with 300 points worth")
            .pointsWorth(Short.valueOf("300"))
            .build();

    private Student student;

    @BeforeEach
    public void setUp() throws Exception {
        student = studentsService.create(new StudentIn("Fake user"));
    }

    @Test
    @DisplayName("Can create a new lesson")
    void createANewLesson() {
        Lesson lesson = lessonsService.createLesson(inputLesson);
        assertEquals("Example-lesson", lesson.getSlug());
        assertEquals(Short.valueOf("300"), lesson.getPointsWorth());
    }

    @Test
    @DisplayName("Can start an existing lesson")
    void startAnExistingLesson() {
        Lesson lesson = lessonsService.createLesson(inputLesson);
        Optional<Progress> progress = lessonsService.start(student, lesson.getId());
        assertTrue(progress.isPresent());
        assertEquals(0, progress.get().getPercent());
    }

    @Test
    @DisplayName("can update any lesson")
    void updateProgressByLesson() {
        Lesson lesson = lessonsService.createLesson(inputLesson);
        lessonsService.start(student, lesson.getId());
        Optional<Progress> progress = lessonsService.updateProgress(
            student,
            lesson.getId(),
            15.0
        );
        assertTrue(progress.isPresent());
        assertEquals(15.0, progress.get().getPercent());
    }
}
