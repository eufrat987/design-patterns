package org.example.design.strategy;

import org.example.design.strategy.behavior.fly.impl.FlyNoWay;
import org.example.design.strategy.duck.Duck;
import org.example.design.strategy.duck.impl.MallardDuck;

/**
 * Design Principles
 * <p>
 * Identify the aspects of your
 * application that vary and separate
 * them from what stays the same.
 * <p>
 * Program to an interface, not an
 * implementation.
 * <p>
 * Favor composition over inheritance.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.fly();
        duck.setFlyBehavior(new FlyNoWay());
        duck.fly();
    }
}