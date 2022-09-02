package org.example;

import java.util.List;

public class Triangle extends Polyline {
    public Triangle(String name, List<Point> vertices) {
        super(name, vertices);
        if(vertices.size() != 3) { //you can add additional check if points aren't collinear
            throw new IllegalArgumentException("Wrong count of points provided for Triangle ctor");
        }
    }
}
