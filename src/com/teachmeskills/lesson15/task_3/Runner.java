package com.teachmeskills.lesson15.task_3;

import java.sql.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/**Create a collection of integers.
 * Fill the collection with random numbers.
 * Let the size of the collection be set from the console.
 * Provide for possible errors when getting the collection size from the console.
 * Provide validity check of the entered collection size.
 * Calculate and display the arithmetic mean of all items in the collection.*/
public class Runner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of the collection of numbers: ");

        try {
            int numberCollectionSize = scan.nextInt();
            ArrayList<Integer> numberCollection = new ArrayList<Integer>(numberCollectionSize);

            int counter = 1;
            while (counter <= numberCollectionSize) {
                numberCollection.add((int) (Math.random() * 100));
                counter++;
            }
            System.out.println(numberCollection);

            int result = 0;
            for(int num : numberCollection){
                result = result + num;
            }

            System.out.println("Arithmetic mean of collection numbers: " + (result/numberCollectionSize));

        } catch (InputMismatchException e){
            System.out.println("Invalid input character");
        } catch (Exception e){
            System.out.println("Unexpected error");
        }

    }

}
