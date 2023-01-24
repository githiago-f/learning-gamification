package org.example.demo.core.gamification;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Score {
    private Long points;

    public Score() { this.points = 0L; }
}
