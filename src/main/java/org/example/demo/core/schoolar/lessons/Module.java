package org.example.demo.core.schoolar.lessons;

import java.util.HashSet;
import java.util.Set;

public class Module {
    private final Long id;
    private String name;
    private final Set<Lesson> lessons;
    private final Set<Subject> subjects;

    public Module() {
        this(null, null, new HashSet<>(), new HashSet<>());
    }

    public Module(Long id, String name, Set<Lesson> lessons, Set<Subject> subjects) {
        this.id = id;
        this.name = name;
        this.lessons = lessons;
        this.subjects = subjects;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Lesson> getLessons() {
        return lessons;
    }

    public Set<Subject> getSubjects() {
        return subjects;
    }
}
