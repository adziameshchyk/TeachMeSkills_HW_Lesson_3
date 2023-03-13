package com.tms.arrays.task_2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Task:
 *
 * Create and fill an array with random numbers and output the maximum, minimum, and average.
 * To generate a random number, use the Math.random() method.
 * Let it be possible to create an array of arbitrary size.
 * Let the size of the array be entered from the console.
 */

public class Task2 {

    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arrayOfIntegers = createArrayOfRandomIntegers(size);
        System.out.println("Array created: " + Arrays.toString(arrayOfIntegers));

        displayMaximumMinimumAverageValueOfArray(arrayOfIntegers);
    }

    private static void displayMaximumMinimumAverageValueOfArray(int[] arrayOfIntegers) {
        Arrays.sort(arrayOfIntegers);
        double averageValue = 0;
        for (int elem : arrayOfIntegers) {
            averageValue += elem;
        }
        averageValue /= arrayOfIntegers.length;

        System.out.println("Maximum value: " + arrayOfIntegers[0] +
                ". Minimum value: " + arrayOfIntegers[arrayOfIntegers.length - 1] +
                ". The average: " + averageValue + ".");
    }

    private static int[] createArrayOfRandomIntegers(int size) {
        int[] arrayOfIntegers = new int[size];
        for (int i = 0; i < size; i++) {
            arrayOfIntegers[i] = (int)(Math.random() * 10);
        }
        return arrayOfIntegers;
    }

}
