package model;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private List<InvoiceItem> items = new ArrayList<>();
    private Notice calculator;

    public Invoice(Notice calculator) {
        this.calculator = calculator;
    }
    public void addItem(Products product) {
        items.add(new InvoiceItem(product));
    }

    public void printInvoice() {
        System.out.println("Nota Fiscal de Mercado:");
        System.out.println(" ");
        for (InvoiceItem item : items) {
            System.out.printf("Produto: %s | Preço Unitário: %.2f | Quantidade: %d | Total: %.2f\n",item.getProductName(), item.getUnitPrice(), item.getQuantity(), item.getTotal());
        }
        System.out.println(" ");
        System.out.printf("Total da Nota: %.2f\n", calculator.totalPrice(items));
    }
}
