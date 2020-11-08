package com.company;

public class Triangle implements Shape{
    protected double side;

    public Triangle(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        double f=((side*side)/2);
        return f;
    }

    @Override
    public double perimeter() {
        double f=side*3;
        return f;
    }
}

