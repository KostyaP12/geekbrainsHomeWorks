package ru.geekbrains.java_level_b.lesson_b;

public class Main {
    protected static String str = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0";


    public static void main(String[] args) {

        try {
            String[][] arr = strToArr(str);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Размер матрицы превышен");
        }
        try {
            System.out.println(divResult(strToArr(str)));
        } catch (NumberFormatException e) {
            System.out.println("В массиве лежит неверный тип данных, а именно не Int");
        }
    }

    public static String[][] strToArr(String str) throws ArrayIndexOutOfBoundsException {
        int x = 0;
        int y = 0;
        String[][] arr = new String[4][4];
        for (String string : str.split("\n")) {
            for (String tmp : string.split(" ")) {
                arr[x][y] = tmp;
                y++;
                if (y == arr.length) {
                    x++;
                    y = 0;
                }
            }
        }
        return arr;
    }

    public static int divResult(String[][] arr) throws NumberFormatException {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum += Integer.parseInt(arr[i][j]);
            }
        }
        return sum / 2;
    }
}
