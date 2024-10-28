package view;

import model.Calculate;
import model.Invoice;
import model.Notice;
import model.Products;

public class Main {
    public static void main(String[] args) {
        Notice calculator = new Calculate();
        Invoice invoice = new Invoice(calculator);

        invoice.addItem(new Products("Arroz", 10.00, 2));
        invoice.addItem(new Products("Feijão", 8.00, 3));
        invoice.addItem(new Products("Macarrão", 5.50, 4));

        invoice.printInvoice();
    }
}