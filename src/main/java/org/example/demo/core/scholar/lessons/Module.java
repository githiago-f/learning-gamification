package org.example.demo.core.scholar.lessons;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@AllArgsConstructor
public class Module {
    @Id
    private String name;

    @ManyToMany(targetEntity = Lesson.class)
    private final Set<Lesson> lessons;

    public Module() { this(null, new HashSet<>()); }

    public Module(String name) {
        this(name, new HashSet<>());
    }

    public void addLesson(Lesson lesson) {
        this.lessons.add(lesson);
    }
    public void removeLesson(Lesson lesson) {
        this.lessons.remove(lesson);
    }

    public Set<Lesson> getLessons() {
        return Collections.unmodifiableSet(lessons);
    }
}
