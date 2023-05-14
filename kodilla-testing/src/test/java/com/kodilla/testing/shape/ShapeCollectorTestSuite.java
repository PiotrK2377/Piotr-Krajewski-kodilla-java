package com.kodilla.testing.shape;

import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Triangle;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Shape;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("TDD: Shape Collector Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
@Nested
@DisplayName("Tests for square")
    class TestSquare {

        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square("Square", 2);
            //When
            shapeCollector.addFigure(square);
            //Then
            assertEquals(square, shapeCollector.getFigure(0));
        }

        @Test
        void testRemovedFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square("Square", 2);
            shapeCollector.addFigure(square);
            //When
            shapeCollector.removeFigure(square);
            //Then
            assertEquals(0, shapeCollector.getFigures().size());
        }

        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square1 = new Square("Square1", 2);
            Shape square2 = new Square("Square2", 4);
            shapeCollector.addFigure(square1);
            shapeCollector.addFigure(square2);
            //When
            Shape squareOne = shapeCollector.getFigure(0);
            Shape squareTwo = shapeCollector.getFigure(1);
            //Then
            assertEquals(square1, squareOne);
            assertEquals(square2, squareTwo);
        }

        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square("Square", 2);
            Shape square1 = new Square("Square1", 4);
            //When
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(square1);
            //Then
            shapeCollector.showFigures();
        }
    }
    @Nested
    @DisplayName("Tests for circle")
    class TestCircle {

        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle("Circle", 2);
            //When
            shapeCollector.addFigure(circle);
            //Then
            assertEquals(circle, shapeCollector.getFigure(0));
        }

        @Test
        void testRemovedFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle("Circle", 2);
            shapeCollector.addFigure(circle);
            //When
            shapeCollector.removeFigure(circle);
            //Then
            assertEquals(0, shapeCollector.getFigures().size());
        }

        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle1 = new Circle("Circle1", 2);
            Shape circle2 = new Circle("Circle2", 4);
            shapeCollector.addFigure(circle1);
            shapeCollector.addFigure(circle2);
            //When
            Shape circleOne = shapeCollector.getFigure(0);
            Shape circleTwo = shapeCollector.getFigure(1);
            //Then
            assertEquals(circle1, circleOne);
            assertEquals(circle2, circleTwo);
        }

        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle("Circle", 2);
            Shape circle1 = new Circle("Circle1", 4);
            //When
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(circle1);
            //Then
            shapeCollector.showFigures();
        }
    }

    @Nested
    @DisplayName("Tests for triangles")
    class TestTriangle {

        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape triangle = new Triangle("Triangle", 2, 3);
            //When
            shapeCollector.addFigure(triangle);
            //Then
            assertEquals(triangle, shapeCollector.getFigure(0));
        }

        @Test
        void testRemovedFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape triangle = new Triangle("Triangle", 2,4);
            shapeCollector.addFigure(triangle);
            //When
            shapeCollector.removeFigure(triangle);
            //Then
            assertEquals(0, shapeCollector.getFigures().size());
        }

        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape triangle1 = new Triangle("Triangle1", 2,5);
            Shape triangle2 = new Triangle("Triangle2", 4,3);
            shapeCollector.addFigure(triangle1);
            shapeCollector.addFigure(triangle2);
            //When
            Shape triangleOne = shapeCollector.getFigure(0);
            Shape triangleTwo = shapeCollector.getFigure(1);
            //Then
            assertEquals(triangle1, triangleOne);
            assertEquals(triangle2, triangleTwo);
        }

        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape triangle = new Triangle("Triangle", 2,4);
            Shape triangle1 = new Triangle("Triangle1", 4, 5);
            //When
            shapeCollector.addFigure(triangle);
            shapeCollector.addFigure(triangle1);
            //Then
            shapeCollector.showFigures();
        }
    }
}
