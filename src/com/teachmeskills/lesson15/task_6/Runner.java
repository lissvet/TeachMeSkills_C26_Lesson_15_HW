package com.teachmeskills.lesson15.task_6;

import java.util.HashSet;
import java.util.Set;
/**Create a collection of unique names of all students in our group + instructor.
 * Display the collection on the screen.*/
public class Runner {

    public static void main(String[] args) {
        Set <String> groupC26 = new HashSet<>();
        groupC26.add("Dmitry");
        groupC26.add("Mark");
        groupC26.add("Daniil");
        groupC26.add("Oleg");
        groupC26.add("Arthur");
        groupC26.add("Stepan");
        groupC26.add("Polina");
        groupC26.add("Ivan");
        groupC26.add("Elisaveta");
        groupC26.add("Sergey");
        groupC26.add("Fedor");
        groupC26.add("Teacher Andrey Reut");

        for(String name : groupC26){
            System.out.println(name);
        }
    }

}
