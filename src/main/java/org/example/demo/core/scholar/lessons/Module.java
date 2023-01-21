package org.example.demo.core.scholar.lessons;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Module {
    private String name;
    private final Set<Lesson> lessons;

    public Module(String name) {
        this(name, new HashSet<>());
    }

    public Module(String name, Set<Lesson> lessons) {
        this.name = name;
        this.lessons = lessons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Lesson> getLessons() {
        return Collections.unmodifiableSet(lessons);
    }

    public void addLesson(Lesson lesson) {
        this.lessons.add(lesson);
    }

    public void removeLesson(Lesson lesson) {
        this.lessons.remove(lesson);
    }
}
