package ru.geekbrains.java_level_a.lesson_e;

public abstract class Animal {
    protected String name;
    protected String colour;
    protected int age;

    abstract boolean run(float magnitude);

    abstract boolean swim(float magnitude);

    abstract boolean jumpOverObstacles(float magnitude);

    Animal(String name, String colour, int age) {
        this.name = name;
        this.colour = colour;
        this.age = age;
    }
}
