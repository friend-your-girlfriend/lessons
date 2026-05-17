package ru.otus.java.basic;

public class fifthLesson {
    public static void main(String[] args) {
        int[][] intArray = {
                {0, -3, 5},
                {-3, 2, 8},
                {2, 2, 8}};

        printArray(intArray);
        System.out.println("Сумма значений больших нуля: " + sumOfPositiveElement(intArray));
        System.out.println("Максимальное значение в массиве: " + findMax(intArray));
        System.out.println("Сумма второй строки: " + sumOfSecondRow(intArray));


        printArray(drawSquare(6));
        printArray(zeroDiagonal(intArray));
    }

    public static int sumOfPositiveElement(int[][] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0)
                    sum += array[i][j];
            }
        }
        return sum;
    }

    public static char[][] drawSquare(int size) {
        char[][] array = new char[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = '*';
            }
        }
        return array;
    }

    public static int[][] zeroDiagonal(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 0;
        }

        for (int i = array.length - 1; i >= 0; i--) {
            int j = array.length - 1 - i;
            array[i][j] = 0;
        }

        return array;
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printArray(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int findMax(int[][] array) {
        int max = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }

        return max;
    }

    public static int sumOfSecondRow(int[][] array) {
        if (array.length < 2) {
            return -1;
        }

        int sum = 0;
        for (int i = 0; i < array[1].length; i++) {
            sum += array[1][i];
        }
        return sum;
    }
}
