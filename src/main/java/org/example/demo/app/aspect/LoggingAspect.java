package org.example.demo.app.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.example.demo.core.scholar.lessons.Lesson;
import org.example.demo.core.scholar.students.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Before("execution(* org.example.demo.core.service.*.start(org.example.demo.core.scholar.students.Student, org.example.demo.core.scholar.lessons.Lesson))")
    public void logAction(JoinPoint jp) {
        Object[] args = jp.getArgs();
        Student st = (Student) args[0];
        Lesson le = (Lesson) args[1];
        String method = jp.getSignature().getName();
        log.info("{} started {}", st, le);
    }
}
