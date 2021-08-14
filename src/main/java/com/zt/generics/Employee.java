package com.zt.generics;

public class Employee {
    private long id;
    private long salary;
    private String name;

    public Employee(long id, long salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public void printInfo() {
        System.out.println("id: " + id + " salary: " + salary + " name: " + name);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
