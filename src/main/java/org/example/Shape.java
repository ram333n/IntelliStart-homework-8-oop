package org.example;

import lombok.Getter;

@Getter
public abstract class Shape {
    protected final String name;

    protected Shape(String name) {
        this.name = name;
    }
}
