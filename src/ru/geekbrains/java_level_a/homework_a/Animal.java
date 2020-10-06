package ru.geekbrains.java_level_a.homework_a;

abstract class Animal {
    private String name;
    private String sex;
    private int age;
    private int id;
    public static final String SEX_MALE = "Male";
    public static final String SEX_FEMALE = "Female";

    public Animal(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
}
