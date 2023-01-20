package org.example.demo.core.schoolar.lessons;

public class Subject {
    private final Long id;
    private String title;
    private String description;

    public Subject() {
        this(null, null, null);
    }

    public Subject(Long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Long getId() {
        return id;
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
}
