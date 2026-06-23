package ru.otus.java.basic;

import java.util.Scanner;

public class Lesson {
    public static void main(String[] args) {
        greetings();
        checkSign(1, 2, 3);
        selectColor();
        compareNumbers();
        addOrSubstractAndPrint(3, 5, true);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5:");
        int number = scanner.nextInt();

        initMethod(number);
    }

    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor() {
        int data = 10;

        if (data <= 10) {
            System.out.println("Красный");
        } else if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 5;
        int b = 6;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubstractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }

    public static void initMethod(int number) {
        switch (number) {
            case 1:
                System.out.println("Метод: greatings()");
                greetings();
                break;
            case 2:
                int a = (int) (Math.random() * 10);
                int b = (int) (Math.random() * 10);
                int c = (int) (Math.random() * 10);
                System.out.println("Метод: checkSign()");
                checkSign(a, b, c);
                break;
            case 3:

                System.out.println("Метод: selectColor()");
                selectColor();
                break;
            case 4:
                System.out.println("Метод: compareNumbers()");
                compareNumbers();
                break;
            case 5:
                int initValue = (int) (Math.random() * 10);
                int delta = (int) (Math.random() * 10);
                boolean increment = (Math.random() <= 0.5);

                System.out.println("Метод: addOrSubstractAndPrint()");
                addOrSubstractAndPrint(initValue, delta, increment);
                break;
            default:
                System.out.println("Набранное число не попадает в диапазон от 1 до 5 включительно");
                break;

        }
    }
}

