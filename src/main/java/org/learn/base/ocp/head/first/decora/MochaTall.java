package org.learn.base.ocp.head.first.decora;

public class MochaTall extends Mocha {

    public MochaTall(Beverage beverage) {
        super(beverage);
    }

    @Override
    protected double getSizeCost() {
        return 0.10;
    }
}
