package ui;

import data.BaseModel;

import java.util.Scanner;

public abstract class BaseMenu {
    Scanner in = new Scanner(System.in);
    public abstract boolean isValid(String temp);
    public abstract void handleChoice(String choice);
    public String menuText;
    public BaseModel model;

    BaseMenu(String menuText, BaseModel model){
        this.menuText = menuText;
        this.model = model;
    }

    public void show() {
        System.out.println(this.menuText);
        String input = null;
        while (input == null) {
            System.out.print("Enter choice: ");
            var temp = in.nextLine();
            if(isValid(temp)){
                input = temp;
            }
        }
        handleChoice(input);
    }
}
