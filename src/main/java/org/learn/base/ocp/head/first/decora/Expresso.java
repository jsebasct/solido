package org.learn.base.ocp.head.first.decora;

public class Expresso extends Beverage {

    @Override
    protected String getDescription() {
        return "Expreso";
    }

    @Override
    protected double cost() {
        return 1.;
    }
}
