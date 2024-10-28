package model;

import java.util.List;

public interface Notice {
    double totalPrice(List<InvoiceItem> items);
}
