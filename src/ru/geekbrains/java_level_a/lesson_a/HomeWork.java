package ru.geekbrains.java_level_a.lesson_a;

public class HomeWork {
    public static void main(String[] args) {
        int a , b, c , d, year;
        a = 10;
        b = 2;
        c = -3;
        d = 15;
        year = 2103;
        String name = "Bob";
        float resultProductOfNumbers = productOfNumbers(a, b, c, d);    // 1 задание
        boolean resultTruthCheck = truthCheck(a, b);                    // 2 задание
        positiveOrNegative(c);                                          // 3 задание
        System.out.println(stringConcatenation(name));                  // 4 задание
        inspectionOfTheVisacousYear(year);                              // 5 задание
    }

    private static float productOfNumbers(float a, float b, float c, float d){
        return a * (b + (c / d));
    }

    private static boolean truthCheck (int firstNumber , int secondNumber){
          return  ((firstNumber + secondNumber) > 10 && (firstNumber + secondNumber) <= 20);
    }

    private static void positiveOrNegative (int number){
        System.out.println((number >= 0)? "Положительное" : "Отрицательное");
    }

    private static String stringConcatenation (String name){
        return "Привет " + name;
    }

    private static void inspectionOfTheVisacousYear(int year) {
        if (year % 400 == 0) {
            System.out.println("Високосный");
        } else if (year % 100 == 0) {
            System.out.println("Не високосный");
        } else if (year % 4 == 0) {
            System.out.println("Високосный");
        } else {
            System.out.println("Не високосый");
        }
    }
}

