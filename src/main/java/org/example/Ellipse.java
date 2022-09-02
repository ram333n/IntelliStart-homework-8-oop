package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
}
