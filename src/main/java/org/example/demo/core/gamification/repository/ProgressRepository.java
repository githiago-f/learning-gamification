package org.example.demo.core.gamification.repository;

import org.example.demo.core.gamification.Progress;
import org.example.demo.core.gamification.vo.ProgressId;
import org.example.demo.core.scholar.students.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProgressRepository extends JpaRepository<Progress, ProgressId> {
    Optional<Progress> findByStudentAndLesson_Id(Student student, Long id);
}
