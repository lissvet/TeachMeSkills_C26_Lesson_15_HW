package com.teachmeskills.lesson15.task_2;

import com.teachmeskills.lesson15.task_2.util.figure.subsidiary_figure.Circle;
import com.teachmeskills.lesson15.task_2.util.figure.main_figure.Figure;
import com.teachmeskills.lesson15.task_2.util.figure.subsidiary_figure.Rectangle;
import com.teachmeskills.lesson15.task_2.util.figure.subsidiary_figure.Triangle;

import java.util.ArrayList;
/**Create a collection of shapes.
 * (Classes for shapes can be taken from previous homework assignments. It is not necessary to use sealed classes)
 * Fill the collection with different figures.
 * Loop through the collection and call a method to calculate and display the perimeter of each shape.*/
public class Runner {

    public static void main(String[] args) {
        ArrayList<Figure> figure = new ArrayList<Figure>();
        figure.add(new Triangle(6, 8, 10));
        figure.add(new Rectangle(6, 17));
        figure.add(new Triangle(9, 50, 22));
        figure.add(new Circle(10));
        figure.add(new Circle(147));

        for(Figure num : figure){
            System.out.println("Perimeter "+ num.name + ": " + (int)(num.calculatePerimeter()));
        }
    }

}
