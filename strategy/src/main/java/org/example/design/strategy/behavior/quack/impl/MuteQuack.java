package org.example.design.strategy.behavior.quack.impl;

import org.example.design.strategy.behavior.quack.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        // do nothing
    }
}
