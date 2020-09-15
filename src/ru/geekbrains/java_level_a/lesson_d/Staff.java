package ru.geekbrains.java_level_a.lesson_d;

import java.util.Calendar;

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

    public int getAge() {
        return Calendar.YEAR - this.birthYear;
    }

    public void setSalary(int salary) {
        this.salary += salary;
    }

    Staff(String fullName, int salary, int age){
        this.fullName = fullName;
        this.salary = salary;
        this.birthYear = Calendar.YEAR - age;
    }
}
