package Inheritance.HeroviredAssignment;

import java.util.Scanner;
import java.util.ArrayList;

class Product {
    private String name;
    private int cost;
    private int count;
    private String specifications;

    public Product(String name, int cost, int count, String specifications) {
        this.cost = cost;
        this.count = count;
        this.name = name;
        this.specifications = specifications;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getCount() {
        return count;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }
}

class Inventory {
    private ArrayList<Product> products;

    public Inventory() {
        products = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void deleteProduct(Product product) {
        products.remove(product);
    }

    public int getProductCount(Product product) {
        return product.getCount();
    }

    public void viewProductDetails(Product product) {
        System.out.println("Product Name: " + product.getName());
        System.out.println("Product Cost: " + product.getCost());
        System.out.println("Product Count: " + product.getCount());
        System.out.println("Product Specifications: " + product.getSpecifications());
    }

    public void viewProductList() {
        for (Product product : products) {
            System.out.println(product.getName());
        }
    }

    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }
}

public class fourthQuestion {
    private static Scanner scanner = new Scanner(System.in);
    private static Inventory inventory = new Inventory();

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. View Product List");
            System.out.println("2. View Product Count");
            System.out.println("3. View Product Details");
            System.out.println("4. Edit Product");
            System.out.println("5. Update Inventory");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    viewProductList();
                    break;
                    case 2:
                    viewProductCount();
                    break;
                case 3:
                    viewProductDetails();
                    break;
                case 4:
                    editProduct();
                    break;
                case 5:
                    updateInventory();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }
    }

    private static void viewProductList() {
        inventory.viewProductList();
    }

    private static void viewProductCount() {
        System.out.print("Enter Product Name: ");
        String name = scanner.nextLine();
        Product product = inventory.getProduct(name);
        if (product == null) {
            System.out.println("Product not found!");
        } else {
            System.out.println("Product Count: " + inventory.getProductCount(product));
        }
    }

    private static void viewProductDetails() {
        System.out.print("Enter Product Name: ");
        String name = scanner.nextLine();
        Product product = inventory.getProduct(name);
        if (product == null) {
            System.out.println("Product not found!");
        } else {
            inventory.viewProductDetails(product);
        }
    }

    private static void editProduct() {
        System.out.print("Enter Product Name: ");
        String name = scanner.nextLine();
        Product product = inventory.getProduct(name);
        if (product == null) {
            System.out.println("Product not found!");
        } else {
            System.out.print("Enter new Product Name: ");
            product.setName(scanner.nextLine());
            System.out.print("Enter new Product Cost: ");
            product.setCost(scanner.nextInt());
            scanner.nextLine();
            System.out.print("Enter new Product Specifications: ");
            product.setSpecifications(scanner.nextLine());
        }
    }

    private static void updateInventory() {
        System.out.println("1. Add Product");
        System.out.println("2. Delete Product");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                addProduct();
                break;
            case 2:
                deleteProduct();
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
                break;
        }
    }

    private static void addProduct() {
        System.out.print("Enter Product Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Product Cost: ");
        int cost = scanner.nextInt();
        System.out.print("Enter Product Count: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Product Specifications: ");
        String specifications = scanner.nextLine();
        Product product = new Product(name, cost, count, specifications);
        inventory.addProduct(product);
    }

    private static void deleteProduct() {
        System.out.print("Enter Product Name: ");
        String name = scanner.nextLine();
        Product product = inventory.getProduct(name);
        if (product == null) {
            System.out.println("Product not found!");
        } else {
            inventory.deleteProduct(product);
        }
    }
}