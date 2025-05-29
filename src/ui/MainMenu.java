package ui;

import data.OrderModel;

import java.util.Scanner;

public class MainMenu extends BaseMenu {
    Scanner in = new Scanner(System.in);
    public boolean isValid(String temp){
        //TODO make real
        return true;
    }
    public void handleChoice(String choice){
        //TODO make real
        if(choice.equalsIgnoreCase("1")){
            var sandwichMenu = new SandwichMenu((OrderModel) this.model);
            sandwichMenu.show();
        }else if(choice.equalsIgnoreCase("3")){
            this.model.save();
        }
        return;
    }
    public MainMenu(OrderModel model){
        super("""
                1 add sandwich
                2
                3 save
                0 exit
                """, model);
    }
}
