package org.example.demo.core.schoolar.lessons;

public class Lesson {
    private final Long id;
    private final String slug;
    private String title;
    private String description;
    private Double gainedScore;

    public Lesson() {
        this(null, null, null, null, 0.0D);
    }

    public Lesson(Long id, String slug, String title, String description, Double gainedScore) {
        this.id = id;
        this.slug = slug;
        this.title = title;
        this.description = description;
        this.gainedScore = gainedScore;
    }

    public Long getId() {
        return id;
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

    public Double getGainedScore() {
        return gainedScore;
    }

    public void setGainedScore(Double gainedScore) {
        this.gainedScore = gainedScore;
    }
}
