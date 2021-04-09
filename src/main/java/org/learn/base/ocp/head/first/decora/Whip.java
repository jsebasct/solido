package org.learn.base.ocp.head.first.decora;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.description = "whip";
        this.beverage = beverage;
    }

//    @Override
//    protected String getDescription() {
//        return ;
//    }

    @Override
    protected double cost() {
        return 0.3 + beverage.cost();
    }
}
