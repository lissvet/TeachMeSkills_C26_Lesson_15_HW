package com.teachmeskills.lesson15.task_1.service;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayCreationService {

    public static ArrayList<Integer> CreateIntegersCollection(String input) throws Exception {
        try {
            Scanner scan = new Scanner(System.in);
            ArrayList<Integer> integers = new ArrayList<>();
            while (!input.equals("exit")) {
                int result = Integer.parseInt(input);
                integers.add(result);
                input = scan.nextLine();
            }
            return integers;
        } catch (NumberFormatException e){
            throw new NumberFormatException();
        } catch (Exception e) {
            throw new Exception();
        }
    }

}
