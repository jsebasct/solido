package org.learn.base.ocp.head.first.decora;

public class MochaGrande extends Mocha {

    public MochaGrande(Beverage beverage) {
        super(beverage);
    }

    @Override
    protected double getSizeCost() {
        return 0.15;
    }
}
