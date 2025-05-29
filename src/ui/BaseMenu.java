package ui;

import data.BaseModel;
import data.IHoldsValue;

import java.util.Scanner;

public abstract class BaseMenu implements IViewable, IHoldsValue {
    Scanner in = new Scanner(System.in);

    public abstract boolean isValid(String temp);

    public abstract void handleChoice(String choice);

    private String menuText;
    public BaseModel model;
    Object value = null;

    BaseMenu(BaseModel model) {
        this.model = model;
    }
    BaseMenu(String menuText, BaseModel model) {
        this.menuText = menuText;
        this.model = model;
    }

    public String getMenuText() {
        return menuText;
    }

    public void render() {
        System.out.println(menuText);
    }

    public String input() {
        String input = null;
        while (input == null) {
            System.out.print("Enter choice: ");
            var temp = in.nextLine().trim();
            if (isValid(temp)) {
                input = temp;
            }
        }
        return input;
    }

    public void show() {
        while (true) {
            render();
            String input = input();
            if (input.equals("0") || input.isEmpty()) {
                break;
            }
            handleChoice(input);
        }
    }

    @Override
    public Object getValue() {
        return this.value;
    }

    @Override
    public Object setValue(Object value) {
        this.value = value;
        return value;
    }
}
