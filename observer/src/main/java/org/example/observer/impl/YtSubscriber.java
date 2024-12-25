package org.example.observer.impl;

import org.example.observer.Event;
import org.example.observer.Observer;

public class YtSubscriber implements Observer {

    private final String name;

    public YtSubscriber(final String name) {
        this.name = name;
    }

    @Override
    public void observe(Event event) {
        if (event instanceof YtVideo) {
            ((YtVideo) event).watch(name);
        }
    }
}
