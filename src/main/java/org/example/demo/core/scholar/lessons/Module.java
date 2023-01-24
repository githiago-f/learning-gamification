package org.example.demo.core.scholar.lessons;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
public class Module {
    private String name;
    private final Set<Lesson> lessons;

    public Module(String name) {
        this(name, new HashSet<>());
    }

    public void addLesson(Lesson lesson) {
        this.lessons.add(lesson);
    }

    public void removeLesson(Lesson lesson) {
        this.lessons.remove(lesson);
    }
}
