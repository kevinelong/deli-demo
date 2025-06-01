package data;

public abstract class Product {
    String name;
    double price;
    protected Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    Product(String name){
        this.name = name;
        this.price = 0;
    }

}
