package com.nit.project01;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class University {

    private int universityId;
    private String universityName;
    private ViceChancellor viceChancellor;
    private List<String> departments;
    private Set<String> campusFacilities;
    private Map<String, Integer> academicPrograms;

    public University() {
    }

    public void setUniversityId(int universityId) {
        this.universityId = universityId;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public void setViceChancellor(ViceChancellor viceChancellor) {
        this.viceChancellor = viceChancellor;
    }

    public void setDepartments(List<String> departments) {
        this.departments = departments;
    }

    public void setCampusFacilities(Set<String> campusFacilities) {
        this.campusFacilities = campusFacilities;
    }

    public void setAcademicPrograms(Map<String, Integer> academicPrograms) {
        this.academicPrograms = academicPrograms;
    }

    @Override
    public String toString() {
        return "University Details\n"
                + "-------------------------\n"
                + "University Id      : " + universityId + "\n"
                + "University Name    : " + universityName + "\n"
                + "Vice Chancellor    : " + viceChancellor + "\n"
                + "Departments        : " + departments + "\n"
                + "Campus Facilities  : " + campusFacilities + "\n"
                + "Academic Programs  : " + academicPrograms;
    }
}
