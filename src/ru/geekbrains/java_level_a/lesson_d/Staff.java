
package ru.geekbrains.java_level_a.lesson_d;

import java.util.Calendar;

public class Staff {
    private String fullName;                                                //Задание 1
    private int salary;                                                     //Задание 1
    private int birthYear;                                                  //Задание 1
    private int id;
    static int firstId = 0;

    public int getId() {                                                    // Задание 3
        return id;
    }

    public String getFullName() {                                           // Задание 3
        return fullName;
    }

    public int getSalary() {                                                // Задание 3
        return salary;
    }

    public int getAge() {                                                   // Задание 3
        return Calendar.getInstance().get(Calendar.YEAR) - this.birthYear;
    }

    public void setSalary(int salary) {                                     // Задание 6
        this.salary += salary;
    }

    Staff(String fullName, int salary, int age){    //Задание 2
        this.fullName = fullName;
        this.salary = salary;
        this.birthYear = Calendar.getInstance().get(Calendar.YEAR) - age;
        this.id = id + firstId++;                                          // Задание 8
    }
}
