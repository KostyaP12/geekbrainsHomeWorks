package ru.geekbrains.java_level_a.lesson_c;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkTicTacToe {

    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';
    private static final char DOT_EMPTY = '.';
    private static final int NUMBER_DOTS_TO_WIN = 4;
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();
    private static char[][] field;
    private static int fieldSizeX;
    private static int fieldSizeY;

    //init field
    private static void initField() {
        fieldSizeY = 5;
        fieldSizeX = 5;
        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = DOT_EMPTY;
            }
        }
    }

    // printField
    private static void printField() {
        System.out.print("+");
        for (int i = 0; i < fieldSizeX * 2 + 1; i++)
            System.out.print((i % 2 == 0) ? "-" : i / 2 + 1);
        System.out.println();

        for (int i = 0; i < fieldSizeY; i++) {
            System.out.print(i + 1 + "|");
            for (int j = 0; j < fieldSizeX; j++)
                System.out.print(field[i][j] + "|");
            System.out.println();
        }

        for (int i = 0; i <= fieldSizeX * 2 + 1; i++)
            System.out.print("-");
        System.out.println();
    }

    // humanTurn
    private static void humanTurn() {
        int x;
        int y;
        do {
            System.out.print("Введите координаты хода X и Y (от 1 до 5) через пробел >>> ");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isCellValid(x, y) || !isCellEmpty(x, y));
        field[y][x] = DOT_HUMAN;
    }

    private static boolean isCellEmpty(int x, int y) {
        return field[y][x] == DOT_EMPTY;
    }

    private static boolean isCellValid(int x, int y) {
        return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
    }

    // aiTurn
    private static void aiTurn() {
        int x;
        int y;
        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while (!isCellEmpty(x, y));
        field[y][x] = DOT_AI;
    }

    // checkWin
    private static boolean checkWin(char c) {
        for (int offsetX = 0; offsetX < fieldSizeX - NUMBER_DOTS_TO_WIN + 1; offsetX++) {
            for (int offsetY = 0; offsetY < fieldSizeX - NUMBER_DOTS_TO_WIN + 1; offsetY++) {
                if (checkDiagonal(c, offsetX, offsetY) || checkLanes(c, offsetX, offsetY)) return true;
            }
        }
        return false;
    }

    private static boolean checkDiagonal(char c, int x, int y) {
        int chekLeftRightChars = 0;
        int chekRightLeftChars = 0;
        for (int i = 0; i < NUMBER_DOTS_TO_WIN; i++) {
            if (field[i + y][i + x] == c) {
                chekLeftRightChars++;
            }
            if (chekLeftRightChars == NUMBER_DOTS_TO_WIN)
                return true;

            if (field[i + y][NUMBER_DOTS_TO_WIN - i - 1 + x] == c) {
                chekRightLeftChars++;
            }
            if (chekRightLeftChars == NUMBER_DOTS_TO_WIN)
                return true;
        }
        return false;
    }

    private static boolean checkLanes(char c, int offsetX, int offsetY) {
        for (int x = offsetX; x < NUMBER_DOTS_TO_WIN + offsetX; x++) {
            int chekVerticalChars = 0;
            int chekHorizontalChars = 0;
            for (int y = offsetY; y < NUMBER_DOTS_TO_WIN + offsetY; y++) {
                if (field[y][x] == c) {
                    chekVerticalChars++;
                }
                if (chekVerticalChars == NUMBER_DOTS_TO_WIN)
                    return true;
                if (field[x][y] == c) {
                    chekHorizontalChars++;
                }
                if (chekHorizontalChars == NUMBER_DOTS_TO_WIN)
                    return true;
            }
        }
        return false;
    }

    //checkDraw
    private static boolean checkDraw() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (isCellEmpty(x, y)) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        while (true) {
            initField();
            printField();
            while (true) {
                humanTurn();
                printField();
                if (gameChecks(DOT_HUMAN, "Human win")) break;
                aiTurn();
                printField();
                if (gameChecks(DOT_AI, "Computer win")) break;
            }
            System.out.println("Play again?");
            if (!SCANNER.next().equals("Y"))
                break;
        }
    }

    private static boolean gameChecks(char dot, String s) {
        if (checkWin(dot)) {
            System.out.println(s);
            return true;
        }
        if (checkDraw()) {
            System.out.println("draw!");
            return true;
        }
        return false;
    }
}

