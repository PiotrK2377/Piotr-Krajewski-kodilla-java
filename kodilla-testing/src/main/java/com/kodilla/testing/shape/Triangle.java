package com.kodilla.testing.shape;

import java.util.Objects;
import java.util.SplittableRandom;

public class Triangle implements Shape{

    private String name;
    private double baseA;
    private double heightH;

    public Triangle(String name, double baseA, double heightH) {
        this.name = name;
        this.baseA = baseA;
        this.heightH = heightH;
    }

    public String getName() {
        return name;
    }

    public double getBaseA() {
        return baseA;
    }

    public double getHeightH() {
        return heightH;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return 0.5 * baseA * heightH;
    }

    @Override
    public String toString() {
        return "Figure is " + name + "about the surface area" + getField();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof  Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return    Double.compare(triangle.getBaseA(), getBaseA()) == 0 &&
                    Double.compare(triangle.getHeightH(), getHeightH()) == 0 &&
                    Objects.equals(getName(), triangle.getName());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getBaseA(), getHeightH());
    }

}
