package org.learn.base.ocp.head.first.decora;

public abstract class Beverage {

    protected String description = "Unknown Beverage";

    /**
     * already implmente for us
     * @return
     */
    protected String getDescription() {
        return description;
    }

    /**
     * Need to implmeent
     * @return
     */
    protected abstract double cost();
}
