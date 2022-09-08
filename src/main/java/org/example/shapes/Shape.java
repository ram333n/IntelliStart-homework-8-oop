package org.example.shapes;

public abstract class Shape {
    protected final String name;

    protected Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
