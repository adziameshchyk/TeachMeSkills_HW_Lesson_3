package com.tms.arrays.task_1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Task:
 *
 * Create an array of integers. Remove all occurrences of the given number from the array.
 * Let the number be specified from the console (Scanner class). If there is no such number, print messages about it.
 * The result should be a new array without the specified number.
 */

public class Task1 {

    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arrayOfIntegers = createArrayOfRandomIntegers(size);
        System.out.println("Array created: " + Arrays.toString(arrayOfIntegers));

        System.out.println("Enter the number to remove: ");
        int numberToRemove = scanner.nextInt();
        int[] newArray = removeNumberFromArray(numberToRemove, arrayOfIntegers);

        System.out.println("Final array: " + Arrays.toString(newArray));
    }

    private static int[] createArrayOfRandomIntegers(int size) {
        int[] arrayOfIntegers = new int[size];
        for (int i = 0; i < size; i++) {
            arrayOfIntegers[i] = (int)(Math.random() * 10);
        }

        return arrayOfIntegers;
    }

    private static int[] removeNumberFromArray(int numberToRemove, int[] arrayOfIntegers) {
        int newArraySize = arrayOfIntegers.length;
        for (int elem : arrayOfIntegers) {
            if (elem == numberToRemove) {
                --newArraySize;
            }
        }
        int[] newArray = new int[newArraySize];
        for (int i = 0, j = 0; i < arrayOfIntegers.length; ) {
            if (arrayOfIntegers[i] == numberToRemove) {
                ++i;
                continue;
            }
            newArray[j++] = arrayOfIntegers[i++];
        }
        return newArray;
    }

}
