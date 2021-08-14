package com.zt.generics;

public class Manager extends Employee{
    private String title;
    private long bonus;

    public Manager(long id, long salary, String name, String title, long bonus) {
        super(id, salary, name);
        this.title = title;
        this.bonus = bonus;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getBonus() {
        return bonus;
    }

    public void setBonus(long bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printInfo() {
        System.out.println("id: " + super.getId() + " salary: " + super.getSalary() + " name: " + super.getName() + " title: " + title + " bonus: " + bonus);
    }
}
