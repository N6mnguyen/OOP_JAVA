package Encapsulation;

public class Products {
    private String name;
    private double price;
    private double tax;

    public Products() {

    }

    public Products(String name, double price, double tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public Products nhapThongTin(String name, double price, double tax) {
        Products pr = new Products(name, price, tax);
        return pr;
    }

    public void xuatThongTin(Products pr) {
        System.out.println(" name = " + pr.getName() + " price = " + pr.getPrice() + " tax= " + pr.getTax());
    }

    public double getTaxPrice(double price, double tax) {
        return price * tax;
    }
}


