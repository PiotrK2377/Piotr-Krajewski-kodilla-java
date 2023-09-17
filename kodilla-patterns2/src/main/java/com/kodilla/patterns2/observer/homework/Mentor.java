package com.kodilla.patterns2.observer.homework;

public class Mentor implements ObserverHomework {

    private String name;
    private int countHomework;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(Student student) {
        System.out.println(name + " you have homework to check by " + student.getName() + "\n" +
                " (total: " + student.getHomeworkLists().size() + " homeworks)");
        countHomework++;
    }

    public String getName() {
        return name;
    }

    public int getCountHomework() {
        return countHomework;
    }
}
