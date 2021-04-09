package org.learn.base.ocp.head.first.decora;

public abstract class CondimentDecorator extends Beverage {

    protected Beverage beverage;

    protected String getDescription() {
        return beverage.getDescription() + ", " + this.description;
    }

    /**
     * All Decorators should implement the getDescription method
     * @return
     */
//    public abstract String getDescription();
}
