package com.tms.arrays.task_4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Task:
 *
 * If the user has entered an invalid number, the program should ask the user to repeat the input.
 * Create an array of n random integers and print it to the screen.
 * Let the array size be set from the console and the array size can be greater than 5 and less than or equal to 10.
 * If n does not satisfy the condition, print a message about it.
 * Create a second array with only the even elements of the first array, if any, and display it on the screen.
 */

public class Task4 {

    public static void main(String[] args) {
        System.out.println("Enter the size of the array. " +
                "Array size must be greater than 5 and less than or equal to 10: ");
        int size;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            size = scanner.nextInt();
            if (size > 5 && size <= 10)
                break;
            System.out.println("Wrong size entered! Enter again: ");
        }
        scanner.close();


        int[] arrayOfIntegers = createArrayOfRandomIntegers(size);
        System.out.println("Array created: " + Arrays.toString(arrayOfIntegers));

        int[] newArray = createArrayOfEvenElementsOfGivenArray(arrayOfIntegers);
        if(newArray.length == 0)
            System.out.println("No even elements!");
        System.out.println("Even array elements:\n" + Arrays.toString(newArray));
    }

    private static int[] createArrayOfRandomIntegers(int size) {
        int[] arrayOfIntegers = new int[size];
        for (int i = 0; i < size; i++) {
            arrayOfIntegers[i] = (int)(Math.random() * 200 - 100);
        }
        return arrayOfIntegers;
    }

    private static int[] createArrayOfEvenElementsOfGivenArray(int[] givenArray) {
        int i = 0;
        int[] newArray = new int[givenArray.length];

        for (int elem : givenArray)
            if (elem % 2 == 0)
                newArray[i++] = elem;

        int[] finalArray = new int[i];
        System.arraycopy(newArray, 0, finalArray, 0, i);

        return finalArray;
    }

}
