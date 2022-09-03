package org.example;

public class Ellipse extends Shape {
    protected Point center;
    protected double majorRadius;
    protected double minorRadius;

    public Ellipse(String name, Point center, double majorRadius, double minorRadius) {
        super(name);
        this.center = center;
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public final double getMajorRadius() {
        return majorRadius;
    }

    public final void setMajorRadius(double majorRadius) {
        this.majorRadius = majorRadius;
    }

    public final double getMinorRadius() {
        return minorRadius;
    }

    public final void setMinorRadius(double minorRadius) {
        this.minorRadius = minorRadius;
    }
}
