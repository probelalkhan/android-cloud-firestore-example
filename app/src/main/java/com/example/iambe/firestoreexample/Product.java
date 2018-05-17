package com.example.iambe.firestoreexample;

public class Product {

    private String name, brand, description;
    private double price;
    private int qty;

    public Product(){

    }

    public Product(String name, String brand, String description, double price, int qty) {
        this.name = name;
        this.brand = brand;
        this.description = description;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }
}
