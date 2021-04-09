package org.learn.base.ocp.head.first.decora;

/**
 * Our goal is to allow classes to be easily extende to incporo new behavourt
 * whitout modifcyn existing code
 *
 * Decorator pattern
 *
 * Start with a class and "decorate it" with the condiments at runtime.
 *
 * Attaches additoinal responsabilities to an object dynamically.
 * Decorators provide a flexible alternative to subclassing for extending functionality
 *
 * we can implement new decorators at any time to add new
 * behavior. If we relied on inheritance, we’d have to go in and change existing code any time we
 * wanted new behavior.
 *
 */
public class Client {
    public static void main(String[] args) {
        DarkRoast darkRoast = new DarkRoast();
        Mocha mocha = new Mocha(darkRoast);
        Whip whip = new Whip(mocha);


        System.out.println("Cost: " + whip.cost());
        System.out.println("Cost: " + whip.getDescription());
    }
}
