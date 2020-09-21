package ru.geekbrains.java_level_a.lesson_e;

import java.util.Random;

public class Dog extends Animal {
    private Random random = new Random();
    private float limitRunMagnitude;
    private float limitJumpMagnitude;
    private float limitSwimMagnitude;
    private int minLimitRun = 400;
    private int maxLimitRun = 600;
    private int minLimitJump = 100;
    private int maxLimitJump = 500;
    private int minLimitSwim = 2;
    private int maxLimitSwim = 15;

    public float getLimitRunMagnitude() {
        return limitRunMagnitude;
    }

    public float getLimitJumpMagnitude() {
        return limitJumpMagnitude;
    }

    public float getLimitSwimMagnitude() {
        return limitSwimMagnitude;
    }

    Dog(String name, String colour, int age) {
        super(name, colour, age);

        this.limitRunMagnitude = (float) (minLimitRun + random.nextInt(maxLimitRun - minLimitRun));
        this.limitJumpMagnitude = (float) (minLimitJump + random.nextInt(maxLimitJump - minLimitJump)) / 1000;
        this.limitSwimMagnitude = (float) (minLimitSwim + random.nextInt(maxLimitSwim - minLimitSwim));
    }

    @Override
    boolean run(float magnitude) {
        return magnitude < limitRunMagnitude;
    }

    @Override
    boolean jumpOverObstacles(float magnitude) {
        return magnitude < limitJumpMagnitude;
    }

    @Override
    boolean swim(float magnitude) {
        return magnitude < limitSwimMagnitude;
    }
}

