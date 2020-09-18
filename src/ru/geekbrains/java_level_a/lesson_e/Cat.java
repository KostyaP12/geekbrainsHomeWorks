package ru.geekbrains.java_level_a.lesson_e;

import java.util.Random;

public class Cat extends Animal {
    private Random random = new Random();
    private float limitRunMagnitude;
    private float limitJumpMagnitude;
    private int minLimitRun = 50;
    private int maxLimitRun = 100;
    private int minLimitJump = 5;
    private int maxLimitJump = 20;

    public float getLimitRunMagnitude() {
        return limitRunMagnitude;
    }

    public float getLimitJumpMagnitude() {
        return limitJumpMagnitude;
    }

    Cat(String name, String colour, int age) {

        super(name, colour, age);

        this.limitRunMagnitude = (float) (minLimitRun +random.nextInt(maxLimitRun - minLimitRun));
        this.limitJumpMagnitude = (float) (minLimitJump +random.nextInt(maxLimitJump - minLimitJump))/10;
    }

    @Override
    boolean run(float magnitude) {
        return magnitude < this.limitRunMagnitude;
    }

    @Override
    boolean jumpOverObstacles(float magnitude) {
        return magnitude < this.limitJumpMagnitude;
    }

    @Override
    boolean swim(float magnitude) {
        return false;
    }
}
