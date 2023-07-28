package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;


@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "Test Name";
    private static final String DESCRIPTION = "Test: list name";

    @Test
    void testTaskListFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME,DESCRIPTION);

        //When
        taskListDao.save(taskList);

        //Then
        String nl = taskList.getListName();
        List<TaskList> readTaskList = taskListDao.findByListName(nl);
        assertEquals("Test Name",nl);

        int id = readTaskList.get(0).getId();
        assertEquals(1, readTaskList.size());

        //CleanUp
        taskListDao.deleteAll();
    }
}
