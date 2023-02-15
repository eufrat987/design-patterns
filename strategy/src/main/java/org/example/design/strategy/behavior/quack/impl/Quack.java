package org.example.design.strategy.behavior.quack.impl;

import org.example.design.strategy.behavior.quack.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
