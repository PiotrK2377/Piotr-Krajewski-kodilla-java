package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.Observer;

import java.util.ArrayList;
import java.util.List;

public class Student implements ObservableHomework {

    private List<ObserverHomework> mentors = new ArrayList<>();
    private List<String> homeworkLists = new ArrayList<>();
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void sendHomework(String homeworkName) {
        homeworkLists.add(homeworkName);
        notifyObservers();
    }

    @Override
    public void registerObserver(ObserverHomework observerHomework) {
        mentors.add(observerHomework);
    }

    @Override
    public void notifyObservers() {
        for (ObserverHomework observerHomework : mentors) {
            observerHomework.update(this);
        }
    }

    @Override
    public void removeObserver(ObserverHomework observerHomework) {
        mentors.remove(observerHomework);
    }

    public List<String> getHomeworkLists() {
        return homeworkLists;
    }

    public String getName() {
        return name;
    }
}
