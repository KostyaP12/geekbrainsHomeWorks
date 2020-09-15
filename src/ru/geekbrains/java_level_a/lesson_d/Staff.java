package ru.geekbrains.java_level_a.lesson_d;

public class Staff {
    private String fullName;
    private int salary;
    private int birthDay;

    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    public int getBirthDay() {
        return birthDay;
    }

    Staff(String fullName, int salary, int birthDay){
        this.fullName = fullName;
        this.salary = salary;
        this.birthDay = birthDay;
    }
}
