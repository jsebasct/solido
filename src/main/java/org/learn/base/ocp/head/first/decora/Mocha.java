package org.learn.base.ocp.head.first.decora;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.description = "Mocha";
        this.beverage = beverage;
    }



    @Override
    protected double cost() {

        double condimentSizeCost = 0.0;

        if (this.getSize() == BeverageSize.TALL) {
            condimentSizeCost = 0.10;
        } else if (this.getSize() == BeverageSize.GRANDE) {
            condimentSizeCost = 0.15;
        } else if (this.getSize() == BeverageSize.VENTI) {
            condimentSizeCost = 0.2;
        }

//        return getSizeCost() + beverage.cost();
        return condimentSizeCost + beverage.cost();
    }


    protected double getSizeCost() {
        return 0.01;
    }
}
