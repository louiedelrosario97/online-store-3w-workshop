package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class StoreApplication
{
    static Scanner scanner = new Scanner(System.in); // Add Scanner class
    static ArrayList<Product> products; // Create array list 'products'
    static ArrayList<Product> cart;     // Create array list 'cart'
                                        // ^^^ these array lists will allow us to store the data in our .csv
    // Methods
    static void main(String[] args)
    {
    products = loadProducts(); // calls loadProducts() and stores the returned ArrayList in products
    }

    static ArrayList<Product> loadProducts() // method that returns an ArrayList of Product objects
    {
        ArrayList<Product> inventory = new ArrayList<>(); // creates a new empty ArrayList to store products in

        return inventory; // sends the ArrayList back to whoever called this method

    }

    // open the CSV file to fill 'inventory' with 'oroducts'
}