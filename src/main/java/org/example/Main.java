package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ShapePrinter printer = new ShapePrinter();

        final List<Point> points = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(1, 0));
        points.add(new Point(0, 1));
        points.add(new Point(1, 1));

        Shape[] shapes = {
            new Ellipse("my ellipse", points.get(0), 2, 2.5),
            new Circle("my circle", points.get(0), 5.5),
            new PolygonalChain("my chain", points),
            new Polygon("my custom polygon", points),
            new Triangle("my triangle", points.subList(0, 3)),
            new Rectangle("my rectangle", points)
        };

        for(Shape shape : shapes) {
            printer.printShape(shape);
        }
    }
}