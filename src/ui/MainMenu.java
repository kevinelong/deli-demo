package ui;

import data.OrderItem;
import products.Chips;
import data.OrderModel;
import products.Drink;

import java.util.Scanner;

public class MainMenu extends BaseMenu {
    Scanner in = new Scanner(System.in);
    public MainMenu(OrderModel model){
        super("""
                1 add sandwich
                2 add drink
                3 add chips
                4 save order
                0 exit
                """, model);
    }

    public boolean isValid(String temp){
        return true;
    }
    public void handleChoice(String choice){
        switch (choice) {
            case "1" -> (new SandwichMenu((OrderModel) this.model)).show();
            case "2" -> this.model.list.add(new OrderItem(new Drink(), 1));
            case "3" -> this.model.list.add(new OrderItem(new Chips(), 1));
            case "4" -> this.model.save();
            default -> System.out.println("Invalid choice");
        }
    }
}
