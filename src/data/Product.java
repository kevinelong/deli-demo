package data;

public abstract class Product {
    String name;
    double price;
    Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    Product(String name){
        this.name = name;
        this.price = 0;
    }

}
