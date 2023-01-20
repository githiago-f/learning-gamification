package org.example.demo.core.gamification;

public class Score {
    private Double value;

    public Score() {}

    public Score(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
