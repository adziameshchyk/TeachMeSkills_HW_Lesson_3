package com.tms.arrays.task_6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Task:
 *
 * Create an array of strings.
 * Fill it in with arbitrary people's names.
 * Sort the array.
 * Output the result to the console.
 */

public class Task6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayOfIntegers = createArrayWithGivenNames(scanner);
        System.out.println("Array created:\n" + Arrays.toString(arrayOfIntegers));

        Arrays.sort(arrayOfIntegers);
        System.out.println("Sorted array:\n" + Arrays.toString(arrayOfIntegers));
    }

    private static String[] createArrayWithGivenNames(Scanner scanner) {
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        String[] arrayOfNames = new String[size];
        System.out.println("Enter names: ");
        for (int i = 0; i < size; ++i) {
            arrayOfNames[i] = scanner.next();
        }
        return arrayOfNames;
    }

}
