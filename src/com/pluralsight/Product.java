package com.pluralsight;

public class Product {
    private String sku;
    private String productName;
    private double price;
    private String department;

    // Getters
    public String getSku() { return sku;}
    public String getProductName() { return productName;}
    public double getPrice() { return price;}
    public String getDepartment() { return department;}

    // Setters
    public void setSku(String sku) { this.sku = sku;}
    public void setProductName(String productName) { this.productName = productName;}
    public void setPrice(double price) { this.price = price;}
    public void setDepartment(String department) { this.department = department;}

    // Constructor
    public Product(String sku, String productName, double price, String department) {
        this.sku = sku;
        this.productName = productName;
        this.price = price;
        this.department = department;
    }
}

