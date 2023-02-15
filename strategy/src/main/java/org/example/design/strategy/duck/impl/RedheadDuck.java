package org.example.design.strategy.duck.impl;

import org.example.design.strategy.behavior.fly.impl.FlyWithWings;
import org.example.design.strategy.behavior.quack.impl.Quack;
import org.example.design.strategy.duck.Duck;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        super();
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }
    @Override
    public void display() {
        System.out.println("Look like redhead");
    }
}
