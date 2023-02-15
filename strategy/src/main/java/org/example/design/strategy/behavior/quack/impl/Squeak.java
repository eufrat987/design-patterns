package org.example.design.strategy.behavior.quack.impl;

import org.example.design.strategy.behavior.quack.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
