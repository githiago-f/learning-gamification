package org.example.demo.core.scholar.lessons;

import java.util.Set;

public class Lesson {
    private final String slug;
    private String title;
    private String description;
    private final Set<Subject> subjects;
    private final Short pointsWorth;

    public Lesson(String slug, String title, String description, Set<Subject> subjects, Short pointsWorth) {
        this.slug = slug;
        this.title = title;
        this.description = description;
        this.subjects = subjects;
        this.pointsWorth = pointsWorth;
    }

    public String getSlug() {
        return slug;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Subject> getSubjects() {
        return subjects;
    }

    public Short getPointsWorth() {
        return pointsWorth;
    }

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
