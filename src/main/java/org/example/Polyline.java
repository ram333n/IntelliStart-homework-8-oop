package org.example;

import java.util.List;

public abstract class Polyline extends Shape {
    //TODO check if getVertices gets const version of List
    protected final List<Point> vertices;
    protected boolean isPolygon;

    protected Polyline(String name, List<Point> vertices) {
        super(name);
        this.vertices = vertices;
    }
}
