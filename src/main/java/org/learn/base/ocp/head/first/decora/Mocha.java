package org.learn.base.ocp.head.first.decora;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.description = "Mocha";
        this.beverage = beverage;
    }

//    @Override
//    protected String getDescription() {
//        return null;
//    }

    @Override
    protected double cost() {
        return 0.2 + beverage.cost();
    }
}
