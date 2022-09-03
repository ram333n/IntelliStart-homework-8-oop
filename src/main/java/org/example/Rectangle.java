package org.example;

import java.util.List;

public class Rectangle extends Polygon {
    public Rectangle(String name, List<Point> vertices) {
        super(name, vertices);
        if(vertices.size() != 4) { //you can add additional check for collinearity and if angles are right
            throw new IllegalArgumentException("Wrong count of points provided for Triangle ctor");
        }
    }
}
