package com.soap.album;

public class Album {

    private String name;
    private String products;
    private int year;

    public Album(String name, String products, int year) {
        this.name = name;
        this.products = products;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}