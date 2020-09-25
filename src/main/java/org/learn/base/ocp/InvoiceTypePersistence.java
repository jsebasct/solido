package org.learn.base.ocp;

import org.learn.base.single.Invoice;

/**
 * You may think that we could just create multiple classes without an interface and add a save method to all of them.
 */
public interface InvoiceTypePersistence {
    public void save(Invoice invoice);
}
