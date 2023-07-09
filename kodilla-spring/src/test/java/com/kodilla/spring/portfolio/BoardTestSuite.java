package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class BoardTestSuite {

    @Test
    void testAddTask() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        String taskTD = "task to do";
        String taskIP = "task in progress";
        String taskD = "task done";

        board.getToDoList().getTasks().add(taskTD);
        board.getInProgressList().getTasks().add(taskIP);
        board.getDoneList().getTasks().add(taskD);

        //Then
        assertEquals(taskTD, board.getToDoList().getTasks().get(0));
        assertEquals(taskIP, board.getInProgressList().getTasks().get(0));
        assertEquals(taskD, board.getDoneList().getTasks().get(0));

        System.out.println(board.getToDoList().getTasks().get(0));
        System.out.println(board.getInProgressList().getTasks().get(0));
        System.out.println(board.getDoneList().getTasks().get(0));
    }
}
