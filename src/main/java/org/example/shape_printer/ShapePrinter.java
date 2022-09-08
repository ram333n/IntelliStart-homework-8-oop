package org.example.shape_printer;

import org.example.shapes.Shape;

public class ShapePrinter {
    public void printShape(Shape shape) {
        System.out.printf("Shape class : %s, name : %s%n", shape.getClass().getSimpleName(), shape.getName());
    }
}
