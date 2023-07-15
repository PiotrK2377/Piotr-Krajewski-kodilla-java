package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task drive = factory.makeTask(TaskFactory.DRIVING);

        //Then
        assertFalse(drive.isTaskExecuted());
        assertEquals("Task: Driving - You have to use car to go Painting Shop",drive.executeTask());
        assertEquals("Driving",drive.getTaskName());
        System.out.println(drive.executeTask());
        assertTrue(drive.isTaskExecuted());

    }

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shop = factory.makeTask(TaskFactory.SHOPPING);

        //Then
        assertFalse(shop.isTaskExecuted());
        assertEquals("Task: The shopping - You have to buy 2.0 brush", shop.executeTask());
        assertEquals("The shopping", shop.getTaskName());
        System.out.println(shop.executeTask());
        assertTrue(shop.isTaskExecuted());

    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task paint = factory.makeTask(TaskFactory.PAINTING);

        //Then
        assertFalse(paint.isTaskExecuted());
        assertEquals("Task: Painting - You are to paint kitchen white", paint.executeTask());
        assertEquals("Painting", paint.getTaskName());
        System.out.println(paint.executeTask());
        assertTrue(paint.isTaskExecuted());
    }
}
