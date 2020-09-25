package org.learn.base.ocp;

public class PersistenceManager {
    InvoicePersistence invoicePersistence;
    //BookPersistence bookPersistence;

    public PersistenceManager(InvoicePersistence invoicePersistence) {
    //                          , BookPersistence bookPersistence) {
        this.invoicePersistence = invoicePersistence;
        //this.bookPersistence = bookPersistence;
    }
}
