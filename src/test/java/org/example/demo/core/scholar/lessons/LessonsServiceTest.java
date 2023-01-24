package org.example.demo.core.scholar.lessons;

import org.example.demo.core.scholar.lessons.in.LessonIn;
import org.example.demo.core.scholar.lessons.repository.LessonRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class LessonsServiceTest {
    private LessonsService lessonsService;

    private final LessonIn inputLesson = LessonIn.builder()
            .title("Example lesson")
            .description("Lesson with 300 points worth")
            .pointsWorth(Short.valueOf("300"))
            .build();

    @BeforeEach
    void setUp() {
        LessonRepository lessonRepository = Mockito.mock(LessonRepository.class);
        lessonsService = new LessonsService(lessonRepository);
        Mockito.when(lessonRepository.save(Mockito.any(Lesson.class)))
                .thenReturn(inputLesson.asEntity());
    }

    @Test
    @DisplayName("Can create a new lesson")
    void createANewLesson() {
        Lesson lesson = lessonsService.createLesson(inputLesson);
        assertEquals("Example-lesson", lesson.getSlug());
        assertEquals(Short.valueOf("300"), lesson.getPointsWorth());
    }
}
