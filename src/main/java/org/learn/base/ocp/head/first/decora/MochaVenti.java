package org.learn.base.ocp.head.first.decora;

public class MochaVenti extends Mocha {

    public MochaVenti(Beverage beverage) {
        super(beverage);
    }

    @Override
    protected double getSizeCost() {
        return 0.4;
    }
}
