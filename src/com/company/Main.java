package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        double length;
            System.out.println("Ingrese la medida a utilizar");
            length= sc.nextDouble();
        int a, b;
            System.out.println("Que dato desea obtener?" +
                    "\n 1) Perimetro" +
                    "\n 2) Area" +
                    "\n 0) Salir");
            a = sc.nextInt();
            System.out.println("De que figura desea obtener el dato?" +
                    "\n 1) Cuadrado" +
                    "\n 2) Circulo" +
                    "\n 3) Triangulo");
            b = sc.nextInt();

            switch (b) {
                case 1:
                    new Square(length);
                    if (a == 1) {
                        new Square(length) {
                            @Override
                            public double perimeter() {
                                return perimeter();
                            }
                        };
                    }
                    else if (a==2){
                        new Square(length) {
                            @Override
                            public double area() { return area(); }
                        };
                    }
                    break;
                case 2:
                    new Circle(length);
                    if (a==1) {
                        new Circle(length) {
                            @Override
                            public double perimeter() {
                                return perimeter();
                            }
                        };
                    }
                    else if (a==2) {
                        new Circle(length) {
                            @Override
                            public double area() {
                                return area();
                            }
                        };
                    }
                case 3:
                    new Triangle(length);
                    if (a==1) {
                        new Triangle(length) {
                            @Override
                            public double perimeter() {
                                return perimeter();
                            }
                        };
                    }
                    else if (a==2) {
                        new Triangle(length) {
                            @Override
                            public double area() {
                                return area();
                            }
                        };
                    }
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + b);
            }
        }
    }

