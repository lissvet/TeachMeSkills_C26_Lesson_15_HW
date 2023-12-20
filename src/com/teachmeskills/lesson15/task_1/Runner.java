package com.teachmeskills.lesson15.task_1;

import com.teachmeskills.lesson15.task_1.service.ArrayCreationService;

import java.util.ArrayList;
import java.util.Scanner;
/** Create a collection of integers and fill it with values entered from the console.
 * When filling the collection with numbers from the console, a type conversion should be performed.
 * You can use the following code to convert a string to a number:
 * int i = Integer.parseInt(str); or int val = Integer.valueOf(str);
 * Type the word "exit" to end the input.
 * When converting a string to a number, be aware of the possibility of exceptions.
 * Print even numbers from the collection.*/
public class Runner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer for the collection (if you want to exit: enter exit): ");
        String input = scan.nextLine();

        ArrayList<Integer> integers;
        try {
            integers = ArrayCreationService.CreateIntegersCollection(input);
        } catch (NumberFormatException e){
            System.out.println("Invalid String for add to collection.");
            return;
        } catch (Exception e) {
            System.out.println("Unexpected exception.");
            return;
        }

        System.out.println("Even numbers collection: ");
        for (int num : integers){
            if(num%2 == 0){
                System.out.println(num);
            }
        }
    }

}
