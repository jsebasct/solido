package org.learn.base.ocp.head.first.decora;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.description = "Whip";
        this.beverage = beverage;
    }

    @Override
    protected double cost() {

        double condimentSizeCost = 0.1;

        if (this.getSize() == BeverageSize.TALL) {
            condimentSizeCost = 0.12;
        } else if (this.getSize() == BeverageSize.GRANDE) {
            condimentSizeCost = 0.17;
        } else if (this.getSize() == BeverageSize.VENTI) {
            condimentSizeCost = 0.22;
        }

        return condimentSizeCost + beverage.cost();
    }
}
