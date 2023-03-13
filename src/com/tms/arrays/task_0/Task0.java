package com.tms.arrays.task_0;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Task:
 *
 * Create an array of integers.
 * Write a program that displays a message about whether a given number is in an array or not.
 * Let the search number be specified from the console.
 */

public class Task0 {

    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arrayOfIntegers = createArrayOfRandomIntegers(size);
        System.out.println("Array created: " + Arrays.toString(arrayOfIntegers));

        while (true) {
            System.out.println("Enter the number to search. To exit the program press -1 and confirm exit: ");
            int numberToCheck = scanner.nextInt();
            if (numberToCheck == -1) {
                System.out.println("Do you want to exit the program? Yes (Y) / No (N): ");
                char choice = scanner.next().charAt(0);
                if (choice == 'Y' || choice == 'y' || choice == 'н')
                    break;
                else if (choice == 'N' || choice == 'n' || choice == 'т') {
                    continue;
                }
                else {
                    System.out.println("Character entered incorrectly!");
                    continue;
                }
            }

            if (isInArray(numberToCheck, arrayOfIntegers))
                System.out.println("The given number is present in the array");
            else
                System.out.println("The given number is not in the array");
        }

        System.out.println("Program completed.");
        scanner.close();
    }

    private static int[] createArrayOfRandomIntegers(int size) {
        int[] arrayOfIntegers = new int[size];
        for (int i = 0; i < size; i++) {
            arrayOfIntegers[i] = (int)(Math.random() * 10);
        }

        return arrayOfIntegers;
    }

    private static boolean isInArray(int numberToCheck, int[] arrayOfInteger) {
        Arrays.sort(arrayOfInteger);
        int position = Arrays.binarySearch(arrayOfInteger, numberToCheck);
        return position >= 0;
    }
}
