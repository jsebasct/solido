package org.learn.base.ocp.head.first.decora;

public abstract class Beverage {

    protected String description = "Unknown Beverage";

    protected abstract String getDescription();

    protected abstract double cost();
}
