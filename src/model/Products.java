package model;

import java.io.Serializable;

public class Products implements Notice{
    private double price;
    private int quantity;
    private String name;


    public Products(double price, int quantity, String name) {
        this.price = price;
        this.quantity = quantity;
        this.name = name;
    }

    @Override
    public Double totalPrice() {
        return price * quantity;
    }
}
