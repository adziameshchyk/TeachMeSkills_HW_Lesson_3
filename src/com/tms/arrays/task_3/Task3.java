package com.tms.arrays.task_3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Task:
 *
 * Create 2 arrays of 5 numbers.
 * Print the arrays to the console on two separate lines.
 * Calculate the average of the elements of each array and report which of the arrays this
 * value turned out to be greater (or report that their arithmetic averages are equal).
 */

public class Task3 {

    public static void main(String[] args) {
        int[] arrayOf5Numbers1 = createArrayOfRandom5Numbers();
        int[] arrayOf5Numbers2 = createArrayOfRandom5Numbers();

        System.out.println("Arrays created: ");
        System.out.println(Arrays.toString(arrayOf5Numbers1));
        System.out.println(Arrays.toString(arrayOf5Numbers2));

        double averageOfArray1 = averageOfArray(arrayOf5Numbers1);
        double averageOfArray2 = averageOfArray(arrayOf5Numbers2);

        if (averageOfArray1 == averageOfArray2)
            System.out.println("Arithmetic means are equal.");
        else
            System.out.println("The arithmetic mean is greater for the array " +
                    (averageOfArray1 > averageOfArray2 ? "1" : "2"));
    }

    private static int[] createArrayOfRandom5Numbers() {
        int[] arrayOf5Numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            arrayOf5Numbers[i] = (int)(Math.random() * 200 - 100);
        }
        return arrayOf5Numbers;
    }

    private static double averageOfArray(int[] arrayOf5Numbers) {
        double averageOfArray = 0;
        for (int number : arrayOf5Numbers) {
            averageOfArray += number;
        }
        averageOfArray /= arrayOf5Numbers.length;
        return averageOfArray;
    }
}
