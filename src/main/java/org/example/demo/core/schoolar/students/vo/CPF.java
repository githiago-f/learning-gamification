package org.example.demo.core.schoolar.students.vo;

public class CPF {
    private final String value;

    public String toString() {
        return value.formatted("");
    }

    public CPF() {
        this(null);
    }
    public CPF(String value) {
        if(value != null && (value.isBlank() || value.isEmpty())) {
            throw new IllegalArgumentException("this CPF is not valid");
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
