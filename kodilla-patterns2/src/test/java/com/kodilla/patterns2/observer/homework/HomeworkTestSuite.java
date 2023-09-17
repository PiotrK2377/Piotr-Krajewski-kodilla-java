package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeworkTestSuite {

    @Test
    void testHomeworkUpdate() {
        //Given
        Student john = new Student("John Doe");
        Student bella = new Student("Bella Brown");
        Student steve = new Student("Steve Rogers");

        Mentor greg = new Mentor("Gregor Wood");
        Mentor paul = new Mentor("Paul Rod");

        //When
        john.registerObserver(greg);
        bella.registerObserver(greg);
        steve.registerObserver(paul);

        john.sendHomework("Java SQL");
        john.sendHomework("Task 2");
        bella.sendHomework("MySQL Task");
        steve.sendHomework("JavaFx Example");
        steve.sendHomework("Task Example");
        steve.sendHomework("Github task");

        int gregCounter = greg.getCountHomework();
        int paulCounter = paul.getCountHomework();

        //Then
        assertEquals(3, gregCounter);
        assertEquals(3, paulCounter);
    }

}