package org.learn.base.ocp;

import org.learn.base.single.Invoice;

/**
 * Violates Open Closed Principle
 * We should be able to add new functionality without touching the existing code for the class
 * But how are we going to add new functionality without touching the class, you may ask.
 * It is usually done with the help of interfaces and abstract classes.
 */
public class InvoicePersistence {

    Invoice invoice;

    public InvoicePersistence(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToFile() {
        // Creates a file with given name and writes the invoice
    }

    public void saveToDatabase() {
        // Saves the invoice to database
    }
}
