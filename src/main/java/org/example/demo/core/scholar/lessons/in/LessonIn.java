package org.example.demo.core.scholar.lessons.in;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;
import org.example.demo.core.scholar.lessons.Lesson;
import org.example.demo.core.scholar.lessons.Subject;

import java.text.Normalizer;
import java.util.Set;

@Data
@Builder
public class LessonIn {
    @Size(min = 3, max = 255)
    private final String title;
    @NotEmpty
    @NotBlank
    private final String description;
    @Positive
    private final Short pointsWorth;
    private final Set<Subject> subjects;

    public String getSlug() {
        String slug = Normalizer.normalize(title, Normalizer.Form.NFD);
        return slug.replaceAll("\s", "-")
                .replaceAll("[\\p{InCombiningDiacriticalMarks}]", "")
                .substring(0, Math.min(slug.length(), 32));
    }

    public Lesson asEntity() {
        return new Lesson(
                null,
                getSlug(),
                getTitle(),
                getDescription(),
                getSubjects(),
                getPointsWorth()
        );
    }
}
