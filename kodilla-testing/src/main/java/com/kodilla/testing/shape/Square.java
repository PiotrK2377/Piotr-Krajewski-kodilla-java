package com.kodilla.testing.shape;

import java.util.Objects;
public class Square implements Shape{

   private String name;
   private double flankA;

   public Square(String name, double flankA) {
       this.name = name;
       this.flankA = flankA;
   }

   public String getName() {
       return name;
   }

   public double getFlankA() {
       return flankA;
   }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return flankA * flankA;
    }

    @Override
    public String toString() {
       return "Figure is " + name + "about the surface area" + getField();
    }

    @Override
    public boolean equals(Object o) {
       if (this == o) return true;
       if (!(o instanceof Square)) return false;
       Square square = (Square) o;
       return Double.compare(square.getFlankA(), getFlankA()) == 0 &&
               getName().equals(square.getName());
    }
    @Override
    public int hashCode() {
       return Objects.hash(getName(), getFlankA());
    }
}
