package com.teachmeskills.lesson15.task_2.util.figure.subsidiary_figure;

import com.teachmeskills.lesson15.task_2.util.figure.main_figure.Figure;

public class Rectangle extends Figure {

    public double height;
    public double base;
    public Rectangle(double height, double base) {
        this.height = height;
        this.base = base;
        super.name = "Rectangle";
    }

    public double calculatePerimeter(){
        double perimeter;
        perimeter = (height + base) * 2;
        return perimeter;
    }

}
