package org.example;

public class ShapePrinter {
    public void printShape(Shape shape) {
        System.out.printf("Shape class : %s, name : %s%n", shape.getClass().getSimpleName(), shape.getName());
    }
}
