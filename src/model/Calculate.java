package model;

import java.util.List;

public class Calculate implements Notice{

    @Override
    public double totalPrice(List<InvoiceItem> items) {
        return items.stream().mapToDouble(InvoiceItem::getTotal).sum();
    }
}
