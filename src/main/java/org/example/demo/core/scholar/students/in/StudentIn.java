package org.example.demo.core.scholar.students.in;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.demo.core.gamification.Score;
import org.example.demo.core.scholar.students.Student;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentIn {
    @Size(min = 3, max = 80)
    private String name;

    public Student asEntity() {
        return new Student(getName(), new Score());
    }
}
