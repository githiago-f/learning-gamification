package org.example.demo.core.schoolar.students;

import org.example.demo.core.gamification.Score;
import org.example.demo.core.schoolar.students.vo.CPF;

public class Student {
    private final Long id;
    private String name;
    private final CPF cpf;
    private Score score;

    public Student() {
        this(null, null, null, new Score(0.0D));
    }

    public Student(Long id, String name, String cpf, Score score) {
        this.id = id;
        this.name = name;
        this.cpf = new CPF(cpf);
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public CPF getCpf() {
        return cpf;
    }

    public Score getScore() {
        return score;
    }
}
