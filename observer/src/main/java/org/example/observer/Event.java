package org.example.observer;

public interface Event {

    void addObserver(Observer o);

    void trigger();

}
