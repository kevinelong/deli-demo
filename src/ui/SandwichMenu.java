package ui;

import data.OrderModel;

import java.util.Scanner;

public class SandwichMenu extends BaseMenu {
    Scanner in = new Scanner(System.in);

    public boolean isValid(String temp) {
        int i = Integer.parseInt(temp);
        return i >= 0 && i <= 4;
    }

    public void handleChoice(String choice) {
        switch (choice) {
            case "1" -> (new MeatMenu((OrderModel) model)).show();
            case "2" -> (new CheeseMenu((OrderModel) model)).show();
            case "3" -> (new BreadMenu((OrderModel) model)).show();
            default -> System.out.println("Invalid choice");
        }
    }

    public SandwichMenu(OrderModel model) {
        super("""
                SANDWICH MENU
                1. add meat
                2. add cheese
                3. add bread
                4. select size
                0 exit
                """, model);
    }
}
