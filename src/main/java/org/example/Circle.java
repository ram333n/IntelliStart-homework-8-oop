package org.example;

public class Circle extends Ellipse {
    public Circle(String name, Point center, double radius) {
        super(name, center, radius, radius);
    }

    public double getRadius() {
        return majorRadius;
    }

    public void setRadius(double radius) {
        this.majorRadius = radius;
        this.minorRadius = radius;
    }
}
