package com.company;

public class Square implements Shape {
    protected double side;
    protected double area;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        double f=side*side;
        System.out.println(f);
        return f;
    }

    @Override
    public double perimeter() {
        double f= side*4;
        return f;
    }
}
