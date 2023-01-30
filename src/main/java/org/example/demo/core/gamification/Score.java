package org.example.demo.core.gamification;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Embeddable
@AllArgsConstructor
public class Score {
    private Long points;

    public Score() { this.points = 0L; }
}
