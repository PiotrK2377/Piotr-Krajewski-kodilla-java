package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("inProgressList")
    TaskList inProgresList;

    @Autowired
    @Qualifier("doneList")
    TaskList doneList;

    @Autowired
    @Qualifier("toDoList")
    TaskList toDoList;

    @Bean(name = "inProgressList")
    @Scope("prototype")
    public TaskList getInProgresList() {
        return new TaskList();
    }

    @Bean(name = "doneList")
    @Scope("prototype")
    public TaskList getGetDoneList() {
        return new TaskList();
    }

    @Bean(name = "toDoList")
    @Scope("prototype")
    public TaskList getGetToDoList() {
        return new TaskList();
    }

    @Bean
    public Board getBoard() {
        return new Board(inProgresList, doneList, toDoList);
    }

}
