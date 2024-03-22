package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//this is class for fooditem
class FoodItem{
    private String name;
    private double price;
    private int quantity;
    private String optional_item;
    private String Size_Food;
    public FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.optional_item = optional_item;
        this.Size_Food = Size_Food;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getOptinal_item() {
        return optional_item;
    }

    public String getSize_Food() {
        return Size_Food;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class ShoppingCart {
    private ArrayList<FoodItem> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void updateQuantity(int index, int quantity) {
        items.get(index).setQuantity(quantity);
    }
    public double calculateTotal() {
        double total = 0;
        for (FoodItem item : items) {
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }
}
