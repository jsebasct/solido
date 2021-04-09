package org.learn.base.ocp.head.first.decora;

public class HouseBlend extends Beverage {
    @Override
    protected String getDescription() {
        return "House Blend";
    }

    @Override
    protected double cost() {
        return 3.2;
    }
}
