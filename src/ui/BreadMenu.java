package ui;

import data.OrderModel;

public class BreadMenu extends BaseMenu {
    public BreadMenu(OrderModel model) {
        super("""
                1. Wheat
                2. White
                3. Rye
                """, model);
    }

    @Override
    public boolean isValid(String temp) {
        return false;
    }

    @Override
    public void handleChoice(String choice) {

    }


}
