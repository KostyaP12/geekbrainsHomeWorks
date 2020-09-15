package ru.geekbrains.java_level_a.lesson_d;

public class Staff {
    private String fullName;
    private int salary;
    private int birthYear;

    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    public int getBirthYear() {
        return birthYear;
    }

    Staff(String fullName, int salary, int age){
        this.fullName = fullName;
        this.salary = salary;
        this.birthYear = age;
    }
}
