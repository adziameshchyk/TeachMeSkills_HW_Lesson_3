package com.tms.arrays.task_5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Task:
 *
 * Create an array and populate the array.
 * Print the array to the screen as a string.
 * Replace every odd-indexed element with zero.
 * Again, print the array to the screen on a separate line.
 */

public class Task5 {

    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arrayOfIntegers = createArrayOfRandomIntegers(size);
        System.out.println("Array created: " + Arrays.toString(arrayOfIntegers));

        int[] nullifiedArray = replaceOddIndexesOfArrayElementsWithZeros(arrayOfIntegers);
        System.out.println("\"Nullified\" array:\n" + Arrays.toString(nullifiedArray));
    }

    private static int[] createArrayOfRandomIntegers(int size) {
        int[] arrayOfIntegers = new int[size];
        for (int i = 0; i < size; i++) {
            arrayOfIntegers[i] = (int)(Math.random() * 200 - 100);
        }
        return arrayOfIntegers;
    }

    private static int[] replaceOddIndexesOfArrayElementsWithZeros(int[] arrayOfIntegers) {
        for (int i = 1; i < arrayOfIntegers.length; i += 2)
            arrayOfIntegers[i] = 0;
        return arrayOfIntegers;
    }

}
