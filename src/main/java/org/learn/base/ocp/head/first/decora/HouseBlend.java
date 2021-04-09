package org.learn.base.ocp.head.first.decora;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "House Blend";
    }

    @Override
    protected double cost() {
        return 0.89;
    }
}
