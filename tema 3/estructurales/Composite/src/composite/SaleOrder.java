/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Carlos
 */
public class SaleOrder {

    private long orderId;
    private String customer;
    private Calendar dateTime;
    private List products = new ArrayList();

    public SaleOrder(long orderId, String customer) {
        super();
        this.orderId = orderId;
        this.customer = customer;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Calendar getDateTime() {
        return dateTime;
    }

    public void setDateTime(Calendar dateTime) {
        this.dateTime = dateTime;
    }

    public List getProducts() {
        return products;
    }

    public void setProducts(List products) {
        this.products = products;
    }

    public double getPrice() {
        double price = 0d;
        for (Object child : products) {
            AbstractProduct p=(AbstractProduct)child;
            price +=p.getPrice();
        }
        return price;
    }

    public void addProduct(AbstractProduct product) {
        products.add(product);
    }

    public void removeProduct(AbstractProduct product) {
        products.remove(product);
    }

    public void printOrder() {

        NumberFormat formater = new DecimalFormat("###,##0.00");
        System.out.println("\n=============================================nOrden: " + orderId + "nCliente: " + customer + "nProductos:n");
        for (Object prod : products) {
             AbstractProduct p=(AbstractProduct)prod;
            System.out.println(p.getName() + "ttt$ " + formater.format(p.getPrice()));

        }
        System.out.println("Total: " + formater.format(getPrice()) + "n=============================================");
    }
}
