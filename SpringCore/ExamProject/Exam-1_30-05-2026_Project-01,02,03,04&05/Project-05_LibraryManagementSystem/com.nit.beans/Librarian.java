package com.nit.beans;

public class Librarian {

    private int librarianId;
    private String librarianName;
    private int experience;

    public Librarian() {
    }

    public int getLibrarianId() {
        return librarianId;
    }

    public void setLibrarianId(int librarianId) {
        this.librarianId = librarianId;
    }

    public String getLibrarianName() {
        return librarianName;
    }

    public void setLibrarianName(String librarianName) {
        this.librarianName = librarianName;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Librarian [librarianId=" + librarianId
                + ", librarianName=" + librarianName
                + ", experience=" + experience + "]";
    }
}
