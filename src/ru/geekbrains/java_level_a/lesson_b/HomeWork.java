package ru.geekbrains.java_level_a.lesson_b;

import java.util.Arrays;

public class HomeWork {
    public static void main(String[] arg) {
        //Задание 1
        int[] arrayFirstTask = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Задание 1. Нам данн целочисленный массив " + Arrays.toString(arrayFirstTask) + "После конвератции массив: " + Arrays.toString(changeOneAndZero(arrayFirstTask)));
        //Задание 2
        int[] arraySecondTask = new int[8];
        System.out.println("Задание 2. Пустой массив необходимо заполнить int значениями 1, 4, 7, 10, 13, 16, 19, 22. Массив:" + Arrays.toString(fillingTheArray(arraySecondTask)));
        //Задание 3
        int[] arrayThirdTask = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Задание 3. Нам данн целочисленный массив" + Arrays.toString(arrayThirdTask) + "Необходимо умножить все числа меньше 6 на 2 после умножений массив будет выглядить:" + Arrays.toString(multiplyingElementsInAnArray(arrayThirdTask)));
        /*Задание 4 Задание можно так же реализовать:
                        Через 2 метода вовращающих отдельно значение минимального и максимального чилса.
         */
        int[] arrayFourthTask = {1, 2, 3, 16, 0, 56, 5, 2, 3, 2, 9, 1};
        System.out.println("Задание 4. Данн массив" + Arrays.toString(arrayFourthTask) + "\n\tминимальное значение в данном массиве " + minAndMaxNumberInArray(arrayFourthTask)[0] + "\n\tмаксимальное значение в данном массиве " + minAndMaxNumberInArray(arrayFourthTask)[1]);
        //Задание 5
        int[][] square = new int[9][9];
        System.out.println("Задание 5. Заполнить в квадратном массиве диагональные элементы единицами");
        square = diagonalInSquare(square); // метод возращает многомерный массив, но здесь массив не используется, выводить его через Arrays.toString не стал потому что выводит ссылки.
        //Задание 6
        int[] arraySixthTask = {1, 2, 3, 16, 0, 5, 5, 2, 3, 2, 9, 11};
        boolean answer = checkBalance(arraySixthTask);
        System.out.println("Задание 6: " + answer);
        //Задание 7
        int[] arraySeventhTask = {1, 2, 3, 4, 5};
        int numberToShift = 2;
        System.out.println("Задание 7 дан массив " + Arrays.toString(arraySeventhTask) + "Необходимо сдвинуть массив на " + numberToShift + " элемента. В итоге получаем массив : " + Arrays.toString(shiftArray(arraySeventhTask, numberToShift)));
    }

    private static int[] changeOneAndZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        return array;
    }

    private static int[] fillingTheArray(int[] arraySecondTask) {
        arraySecondTask[0] = 1;
        for (int i = 1; i < arraySecondTask.length; i++){
            arraySecondTask[i] = arraySecondTask[i - 1] + 3;
        }
        return arraySecondTask;
    }

    private static int[] multiplyingElementsInAnArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        return array;
    }

    private static int[] minAndMaxNumberInArray(int[] array) {
        int[] minAndMaxNumbers = new int[2]; // элемент с ключем 0 - это минимальное значение, элемент с ключем 1 это максимальное значение. К сожалению ассоциативных массивов нет(
        for (int j : array) {
            if (j < minAndMaxNumbers[0]) {
                minAndMaxNumbers[0] = j;
            }
            if (j > minAndMaxNumbers[1]) {
                minAndMaxNumbers[1] = j;
            }
        }
        return minAndMaxNumbers;
    }

    private static int[][] diagonalInSquare(int[][] array) {
        int lastKey = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][lastKey] = 1;
            lastKey--;
            System.out.print('\n');
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);
            }
        }
        System.out.println('\n');
        return array;
    }

    private static boolean checkBalance(int[] array) {
        int i = 0;
        int lastKey = array.length - 1;
        int sumLeft = array[0];
        int sumRight = array[lastKey];
        if (sumLeft != sumRight) {
            while (sumLeft != sumRight) {
                if (sumLeft > sumRight) {
                    lastKey -= 1;
                    sumRight += array[lastKey];
                    if (i == lastKey) {
                        return false;
                    }
                } else {
                    i += 1;
                    sumLeft += array[i];
                    if (i == lastKey) {
                        return false;
                    }
                }
            }
        }
        return true;
    } // простите, что такой сложный путь

    private static int [] shiftArray(int[] array, int n) {
        for (int i = 0; i < array.length / n; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        return array;
    }
}
