package org.example.demo.core.gamification;

public class Score {
    private Long points;

    public Score() { this.points = 0L; }

    public Score(Long value) {
        this.points = value;
    }

    public Long getPoints() {
        return points;
    }

    public void setPoints(Long points) {
        this.points = points;
    }
}
