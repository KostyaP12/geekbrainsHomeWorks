package ru.geekbrains.java_level_a.lesson_e;

public class HomeWork {
    public static void main(String[] args) {
        Animal[] animal = {
                new Dog("Bobik", "Black", 5),
                new Dog("Sharik", "Brown", 7),
                new Cat("Leopold", "Orange", 2),
                new Cat("Matroskin", "Grey", 11)
        };
        showInfoRun(animal, 200);
        showInfoJump(animal, 0.8f);
        showInfoSwim(animal, 2);

    }
    /* Можно реализовать отдельно для кошечек и для собачек*/
    public static void showInfoRun(Animal[] animal, float magnitude) {
        for(int i = 0; i < animal.length; i ++) {
            if (animal[i] instanceof Cat) {
                System.out.println(((Cat)animal[i]).run(magnitude)? "Котик пробежал" : "Котик не пробежал");
                System.out.println("Котик может пробежать только:" + ((Cat) animal[i]).getLimitRunMagnitude());
            }
            if (animal[i] instanceof Dog) {
                System.out.println(((Dog)animal[i]).run(magnitude)? "Песик пробежал" : "Песик не пробежал");
                System.out.println("Песик может пробежать только:" + ((Dog) animal[i]).getLimitRunMagnitude());
            }
        }
    }
    public static void showInfoJump(Animal[] animal, float magnitude) {
        for(int i = 0; i < animal.length; i ++) {
            if (animal[i] instanceof Cat) {
                System.out.println(((Cat)animal[i]).jumpOverObstacles(magnitude)? "Котик перепрыгнул" : "Котик не перепрыгнул");
                System.out.println("Котик может пробежать только:" + ((Cat) animal[i]).getLimitJumpMagnitude());
            }
            if (animal[i] instanceof Dog) {
                System.out.println(((Dog)animal[i]).jumpOverObstacles(magnitude)? "Песик перепрыгнул" : "Песик не перепрыгнул");
                System.out.println("Песик может перепрыгнуть только:" + ((Dog) animal[i]).getLimitJumpMagnitude());
            }
        }
    }
    public static void showInfoSwim(Animal[] animal, float magnitude) {
        for(int i = 0; i < animal.length; i ++) {
            if (animal[i] instanceof Cat) {
                System.out.println(((Cat)animal[i]).swim(magnitude)? "Котик переплыл" : "Котик не плавает!");
            }
            if (animal[i] instanceof Dog) {
                System.out.println(((Dog)animal[i]).swim(magnitude)? "Песик переплыл" : "Песик не переплыл");
                System.out.println("Песик может переплыл только:" + ((Dog) animal[i]).getLimitSwimMagnitude());
            }
        }
    }
}

