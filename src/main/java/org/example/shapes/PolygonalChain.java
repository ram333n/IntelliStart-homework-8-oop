package org.example.shapes;

import org.example.point.Point;

import java.util.List;

public class PolygonalChain extends Shape {
    protected final List<Point> vertices;
    protected boolean isClosed;

    public PolygonalChain(String name, List<Point> vertices) {
        super(name);
        this.vertices = vertices;
        checkIsCycled(vertices);
    }

    public boolean isClosed() {
        return isClosed;
    }

    private void checkIsCycled(List<Point> vertices) {
        System.out.println("Checking cyclicity. Vertices : " + vertices);

//        some algorithm, which determines if chain is closed
//        ...

        isClosed = true;
    }
}
