package org.example.demo;

import org.example.demo.app.config.AppConfig;
import org.example.demo.core.gamification.Score;
import org.example.demo.core.scholar.lessons.Lesson;
import org.example.demo.core.scholar.lessons.Module;
import org.example.demo.core.scholar.students.Student;
import org.example.demo.core.service.LessonsService;
import org.example.demo.core.service.ModulesService;
import org.example.demo.core.service.StudentsService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
 * Working with application context with java based configs.
 */
public class DemoApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        ModulesService modulesService = ctx.getBean(ModulesService.class);
        LessonsService lessonsService = ctx.getBean(LessonsService.class);
        StudentsService studentsService = ctx.getBean(StudentsService.class);

        Module module = modulesService.createModule();
        Lesson lesson = lessonsService.createLesson();
        Student student = studentsService.create();

        modulesService.addLesson(module, lesson);
        lessonsService.start(student, lesson);
    }
}
