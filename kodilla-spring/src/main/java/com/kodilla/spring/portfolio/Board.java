package com.kodilla.spring.portfolio;

public class Board {
    private TaskList toDoList;
    private TaskList doneList;
    private TaskList inProgressList;

    public Board(TaskList toDoList, TaskList doneList, TaskList inProgressList) {
        this.toDoList = toDoList;
        this.doneList = doneList;
        this.inProgressList = inProgressList;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }
}
