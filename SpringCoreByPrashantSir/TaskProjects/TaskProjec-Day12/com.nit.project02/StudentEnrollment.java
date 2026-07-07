package com.nit.project02;

import java.util.Set;

public class StudentEnrollment {

    private Set<String> subjects;

    public StudentEnrollment() {
    }

    public StudentEnrollment(Set<String> subjects) {
        this.subjects = subjects;
    }

    public Set<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<String> subjects) {
        this.subjects = subjects;
    }

    public String toString() {
        return "StudentEnrollment [subjects=" + subjects + "]";
    }
}