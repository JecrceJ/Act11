package com.company;

public class Circle implements Shape {
    protected double radio;

    public Circle(double side) {
        this.radio = side;
    }

    @Override
    public double area() {
        double f=((Math.PI*(Math.pow(radio,2))));
        return f;
    }

    @Override
    public double perimeter() {
        double f= (Math.PI*radio*2);
        return f;
    }
}

