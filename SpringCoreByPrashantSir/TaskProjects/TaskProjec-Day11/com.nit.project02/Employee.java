package com.nit.project02;

public class Employee
{
    private String name;
    private int id;
    private Address address;

    public Employee()
    {
        System.out.println("Employee Object Created...");
    }

    public void setName(String name)
    {
        System.out.println("Employee name setter called");
        this.name = name;
    }

    public void setId(int id)
    {
        System.out.println("Employee id setter called");
        this.id = id;
    }

    public void setAddress(Address address)
    {
        System.out.println("Employee address setter called");
        this.address = address;
    }

    @Override
    public String toString()
    {
        return "Employee [name=" + name +
               ", id=" + id +
               ", " + address + "]";
    }
}