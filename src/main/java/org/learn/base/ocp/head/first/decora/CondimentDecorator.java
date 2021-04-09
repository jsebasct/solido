package org.learn.base.ocp.head.first.decora;

public abstract class CondimentDecorator extends Beverage {

    protected Beverage beverage;


    protected String getDescription() {
        return this.description + " con " + beverage.getDescription();
    }

//    @Override
//    protected String cost() {
//        ge
//    }
}
