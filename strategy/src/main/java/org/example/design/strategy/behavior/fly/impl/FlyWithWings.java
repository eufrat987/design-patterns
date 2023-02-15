package org.example.design.strategy.behavior.fly.impl;

import org.example.design.strategy.behavior.fly.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly");
    }
}
