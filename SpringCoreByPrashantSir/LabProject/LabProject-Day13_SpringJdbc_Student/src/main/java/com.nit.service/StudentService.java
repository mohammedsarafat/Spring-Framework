package com.nit.service;

import com.nit.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public Integer getStudentCount() {
        return repository.getStudentCount();
    }

    public String getStudentName(int studentId) {
        return repository.getStudentName(studentId);
    }

    public Double getStudentFees(int studentId) {
        return repository.getStudentFees(studentId);
    }
}
