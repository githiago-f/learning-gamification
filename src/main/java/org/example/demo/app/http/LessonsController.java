package org.example.demo.app.http;

import org.example.demo.core.scholar.lessons.Lesson;
import org.example.demo.core.service.LessonsService;
import org.example.demo.core.scholar.lessons.in.LessonIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(path = { "/lessons" })
public class LessonsController {
    private final LessonsService lessonsService;

    @Autowired
    public LessonsController(LessonsService lessonsService) {
        this.lessonsService = lessonsService;
    }

    @PostMapping
    public ResponseEntity<Lesson> createLesson(@RequestBody LessonIn lessonIn) {
        Lesson lesson = lessonsService.createLesson(lessonIn);
        return ResponseEntity.ok(lesson);
    }

    @GetMapping
    public ResponseEntity<List<Lesson>> listLessons() {
        return ResponseEntity.ok(new ArrayList<>());
    }
}
