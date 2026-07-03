package com.mds.day09;

public class Student {

    // Variables
    String name;
    int id;
    String address;
    Resume resume;

    // Default Constructor
    public Student() {
        System.out.println("Student class constructor called");
    }

    // Parameterized Constructor
    public Student(String name, int id, String address, Resume resume) {
        super();
        System.out.println("Parameterized constructor called");

        this.name = name;
        this.id = id;
        this.address = address;
        this.resume = resume;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Name setter called");
        this.name = name;
    }

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("ID setter called");
        this.id = id;
    }

    // Getter and Setter for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        System.out.println("ADDRESS SETTER CALLED");
        this.address = address;
    }

    // Getter and Setter for Resume
    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        System.out.println("Resume SETTER CALLED");
        this.resume = resume;
    }

    // toString()
    @Override
    public String toString() {
        return "Student [name=" + name +
                ", id=" + id +
                ", address=" + address +
                ", resume=" + resume + "]";
    }
}
