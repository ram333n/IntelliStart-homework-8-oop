package org.example;

import java.util.List;

public class Polygon extends PolygonalChain {
    public Polygon(String name, List<Point> vertices) {
        super(name, vertices);
        if(!isClosed) {
            throw new IllegalArgumentException("Polygonal chain with given vertices doesn't present polygon");
        }
    }
}
