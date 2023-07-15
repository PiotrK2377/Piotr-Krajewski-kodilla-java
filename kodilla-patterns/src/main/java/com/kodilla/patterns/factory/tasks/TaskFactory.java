package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        return switch (taskClass) {
            case SHOPPING -> new ShoppingTask("The shopping","brush",2.0);
            case PAINTING -> new PaintingTask("Painting", "white", "kitchen");
            case DRIVING -> new DrivingTask("Driving","Painting Shop", "car");
            default -> null;
        };
    }
}
