package com.kodilla.patterns2.observer.homework;


public interface ObservableHomework {

    void registerObserver(ObserverHomework observerHomework);
    void notifyObservers();
    void removeObserver(ObserverHomework observerHomework);
}
