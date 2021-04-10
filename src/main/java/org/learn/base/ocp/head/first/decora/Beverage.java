package org.learn.base.ocp.head.first.decora;

public abstract class Beverage {

    protected BeverageSize size;
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

    public void setSize(BeverageSize size) {
        this.size = size;
    }

    public BeverageSize getSize() {
        return this.size;
    }
}
