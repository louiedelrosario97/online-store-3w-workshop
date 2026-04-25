package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class StoreApplication
{
    static Scanner scanner = new Scanner(System.in); // Add Scanner class
    static ArrayList<Product> products;              // Create array list 'products'
    static ArrayList<Product> cart;                  // Create array list 'cart'
                                                     // ^^^ these array lists will allow us to store the data in our .csv to use in our application

    static void main(String[] args)
    {
    products = loadProducts(); // calls 'loadProducts()' and stores the returned ArrayList in 'products'
    homeScreen();
    }

    static void homeScreen()
    {
        while(true)
        {
            System.out.println();
            System.out.println("Welcome to Scam = Null!");
            System.out.println("---------------------------------");
            System.out.println();
            System.out.println("D) Display Products");
            System.out.println("C) Cart");
            System.out.println("E) Exit");
            System.out.print("Make a selection: ");
            String choice = scanner.nextLine().toUpperCase().strip();
            System.out.println();

            switch (choice)
            {
                case "D": // Display Products
                    break;
                case "C": // Cart
                    break;
                case "E": // Exit
                    System.out.println("Cheapskate.");
                    break;
                default:
                    System.out.println("-10 Intelligence");

            }
        }
    }

    static ArrayList<Product> loadProducts() // Create 'loadProducts()' method. Creating separate methods for each task to be organized.
    {
        ArrayList<Product> inventory = new ArrayList<>(); // In the method, we create an array list called 'inventory'. A temporary vehicle to hold our .csv data
        try
        {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("products.csv")); // Load the file into the bufferedReader... now we need to make it read all the lines

            String header = bufferedReader.readLine(); // bufferedReader is now reading the first line
            String line; // Declaring variable to use in while loop

            while ((line = bufferedReader.readLine()) != null) // The bufferedReader will read the next line as long as the value is not null.
            {
            String[]columns = line.split("\\|"); // As the bufferedReader reads each line, it will split the info using "|" as its divider to create an array of 4 elements
            String sku = columns[0];
            String productName = columns[1];
            double price = Double.parseDouble(columns[2]); // bufferedReader reads all elements as Strings, so we need to parse the column to match our desired data type (double)
            String department = columns[3];

            Product product = new Product(sku, productName, price, department);  // Converts the data into instances of Product.
            inventory.add(product);  // Adds all 150 instances of Product into the 'inventory' array list.
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return inventory; // This returns the array list data in "inventory" back to the loadProducts() method

    }

}

        // DONE: Create Product class
        // DONE: Use .csv to load the store's inventory. Create loadProduct() method and use bufferedReader and array lists to extract the data to use for Product objects
        // DONE: Create homeScreen() method
        // TODO: Route the homeScreen() selections to their corresponding methods
        // TODO: displayCart() method

