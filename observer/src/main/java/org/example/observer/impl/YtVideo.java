package org.example.observer.impl;

import org.example.observer.Event;
import org.example.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class YtVideo implements Event {

    private final String title;
    private final List<Observer> ob = new ArrayList<>();

    public YtVideo(final String title) {
        this.title = title;
    }

    public void watch(String name) {
        System.out.println(name + " is watching " + title + ".");
    }

    @Override
    public void addObserver(Observer o) {
        ob.add(o);
    }

    @Override
    public void trigger() {
        for (final Observer o : ob) {
            o.observe(this);
        }
    }
}
