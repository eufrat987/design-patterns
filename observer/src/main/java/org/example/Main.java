package org.example;

import org.example.observer.Observer;
import org.example.observer.impl.YtSubscriber;
import org.example.observer.impl.YtVideo;

public class Main {
    public static void main(final String[] args) {
        final Observer observer1 = new YtSubscriber("Sub Zero");
        final Observer observer2 = new YtSubscriber("Kung Lao");
        final Observer observer3 = new YtSubscriber("Scorpion");

        final YtVideo video1 = new YtVideo("Baby Shark Dance");
        final YtVideo video2 = new YtVideo("Bath Song");
        final YtVideo video3 = new YtVideo("Roar");

        video1.addObserver(observer1);
        video1.addObserver(observer2);

        video2.addObserver(observer1);
        video2.addObserver(observer3);

        video3.addObserver(observer2);
        video3.addObserver(observer3);

        video1.trigger();
        video2.trigger();
        video3.trigger();
    }
}