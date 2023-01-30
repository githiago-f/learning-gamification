package org.example.demo.core.scholar.lessons;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "lessons")
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Size(min = 3, max = 32)
    private String slug;
    private String title;
    private String description;
    @OneToMany(targetEntity = Subject.class)
    private Set<Subject> subjects;
    private Short pointsWorth;

    @Override
    public String toString() {
        return "Lesson{" +
                "slug='" + slug + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", subjects=" + subjects +
                ", pointsWorth=" + pointsWorth +
                '}';
    }
}
