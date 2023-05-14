package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {

    private String name;
    private double radiusR;

    public Circle(String name, double radiusR) {
        this.name = name;
        this.radiusR = radiusR;
    }

    public String getName() {
        return name;
    }

    public double getRadiusR() {
        return radiusR;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return 3.14 * radiusR * radiusR;
    }

    @Override
    public String toString() {
        return "Figure is " + name + "about the surface area" + getField();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return getRadiusR() == circle.getRadiusR() &&
                Objects.equals(getName(), circle.getName());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getRadiusR());
    }
}
