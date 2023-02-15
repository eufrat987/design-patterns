package org.example.design.strategy.duck.impl;

import org.example.design.strategy.behavior.fly.impl.FlyNoWay;
import org.example.design.strategy.behavior.quack.impl.Squeak;
import org.example.design.strategy.duck.Duck;

public class RubberDuck extends Duck {
    public RubberDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Squeak());
    }
    @Override
    public void display() {
        System.out.println("Look like rubber");
    }
}
