package ru.geekbrains.java_level_a.homework_a;

public class Mammals extends Animal {
    private String view;
    private int numberOfCage;

    public Mammals(String name, String sex, int age, String view, int numberOfCage) {
        super(name, sex, age);
        this.view = view;
        this.numberOfCage = numberOfCage;
    }
}
