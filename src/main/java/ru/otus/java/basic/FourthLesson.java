package ru.otus.java.basic;

import java.util.Arrays;

public class FourthLesson {
    public static void main(String[] args) {
        int[] firstArray = new int[]{1, 2, 3};
        int[] secondArray = new int[]{2, 2};
        int[] thirdArray = new int[]{1, 1, 1, 1, 1};
        int[] fourthArray = new int[]{5, 3, 4, -2};

        getSumArray(firstArray, secondArray, thirdArray);
        getCenterPointOfSum(fourthArray);
        checkIsSortedArray(fourthArray);
        reverseArray(fourthArray);
        System.out.println(Arrays.toString(fourthArray));
    }

    public static void getSumArray(int[]... array) {
        int maxLength = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].length > maxLength) {
                maxLength = array[i].length;
            }
        }

        int[] sumArray = new int[maxLength];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sumArray[j] += array[i][j];
            }
        }

        System.out.println(Arrays.toString(sumArray));
    }

    public static void getCenterPointOfSum(int[] array) {
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < array.length; i++) {
            leftSum += array[i];
            for (int j = i + 1; j < array.length; j++) {
                rightSum += array[j];
            }

            if (leftSum == rightSum) {
                System.out.println("Точка находится между элементами: " + array[i] + " и " + array[i + 1]);
            } else {
                rightSum = 0;
            }
        }
    }

    public static void checkIsSortedArray(int[] array) {
        // Думаю, что можно проще реализовать - не могу придумать как.
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                System.out.println("Элементы массива не идут в порядке возрастания");
                break;
            } else if (array[i] <= array[i + 1] && array[i + 1] == array.length)
                System.out.println("Массив в порядке возрастания");
        }
    }

    public static void reverseArray(int[] array) {
        System.out.println("Массив: " + Arrays.toString(array));

        int[] reversArray = new int[array.length];
        int j = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            reversArray[j++] = array[i];
        }

        System.out.println("Перевернутый массив: " + Arrays.toString(reversArray));
    }
}
