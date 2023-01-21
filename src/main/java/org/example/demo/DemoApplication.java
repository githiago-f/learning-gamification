package org.example.demo;

import org.example.demo.app.config.AppConfig;
import org.example.demo.core.gamification.Score;
import org.example.demo.core.scholar.lessons.Lesson;
import org.example.demo.core.scholar.lessons.Module;
import org.example.demo.core.scholar.students.Student;
import org.example.demo.core.service.LessonsService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
 * Working with application context with java based configs.
 */
public class DemoApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        LessonsService lessonsService = ctx.getBean(LessonsService.class);
        Module module = lessonsService.createModule();
        Lesson lesson = lessonsService.createLesson();
        lessonsService.addLesson(module, lesson);

        final Student student = new Student("", new Score());

        lessonsService.start(student, lesson);
    }
}
