package org.example.design.strategy.duck;

import org.example.design.strategy.behavior.fly.FlyBehavior;
import org.example.design.strategy.behavior.quack.QuackBehavior;

abstract public class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck() {
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
    public void quack() {
        quackBehavior.quack();
    }
    public void swim() {
        System.out.println("Swim");
    }
    abstract public void display();

    public void fly() {
        flyBehavior.fly();
    }
}
