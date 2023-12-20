package com.teachmeskills.lesson15.task_2.util.figure.subsidiary_figure;

import com.teachmeskills.lesson15.task_2.util.figure.main_figure.Figure;

public class Circle extends Figure {

    public double radius;
    public Circle(double radius) {
        this.radius = radius;
        super.name = "Circle";
    }

    public double calculatePerimeter(){
        double perimeter;
        perimeter = radius * 3.14 * 2;
        return perimeter;
    }

}
