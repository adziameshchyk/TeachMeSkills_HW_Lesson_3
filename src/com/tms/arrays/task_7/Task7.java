package com.tms.arrays.task_7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Task:
 *
 * Implement a bubble sort algorithm.
 */

public class Task7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayOfIntegers = createArrayOfIntegers(scanner);
        System.out.println("Array created: " + Arrays.toString(arrayOfIntegers));

        bubbleSort(arrayOfIntegers);
        System.out.println(Arrays.toString(arrayOfIntegers));
    }

    private static int[] createArrayOfIntegers(Scanner scanner) {
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arrayOfIntegers = new int[size];
        for (int i = 0; i < arrayOfIntegers.length; i++) {
            arrayOfIntegers[i] = (int)(Math.random() * 200 - 100);
        }
        return arrayOfIntegers;
    }

    private static void bubbleSort(int[] arrayOfIntegers) {
        for (int i = 0; i < arrayOfIntegers.length; i++) {
            for (int j = 1; j < arrayOfIntegers.length - i; j++) {
                if (arrayOfIntegers[j - 1] > arrayOfIntegers[j]) {
                    int temp = arrayOfIntegers[j];
                    arrayOfIntegers[j] = arrayOfIntegers[j - 1];
                    arrayOfIntegers[j - 1] = temp;
                }
            }
        }
    }

}
