package org.learn.base.ocp.head.first.decora;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    protected double cost() {
        return 1.99;
    }
}
