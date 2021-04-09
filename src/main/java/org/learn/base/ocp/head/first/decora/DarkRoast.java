package org.learn.base.ocp.head.first.decora;

public class DarkRoast extends Beverage {
    @Override
    protected String getDescription() {
        return "Dark Roast";
    }

    @Override
    protected double cost() {
        return 4.5;
    }
}
