package model;

public class InvoiceItem {
    private Products product;
    private double total;

    public InvoiceItem(Products product) {
        this.product = product;
        this.total = product.getTotalPrice();
    }
    public String getProductName() {
        return product.getName();
    }

    public double getUnitPrice() {
        return product.getPrice();
    }

    public int getQuantity() {
        return product.getQuantity();
    }
    public double getTotal() {
        return total;
    }
}
