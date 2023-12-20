package com.teachmeskills.lesson15.task_2.util.figure.subsidiary_figure;

import com.teachmeskills.lesson15.task_2.util.figure.main_figure.Figure;

public class Triangle extends Figure {

    public double side1;
    public double side2;
    public double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        super.name = "Triangle";
    }

    public double calculatePerimeter(){
        double perimeter;
        perimeter = side1 + side2 + side3;
        return perimeter;
    }

}
