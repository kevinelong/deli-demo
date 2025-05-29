package ui;

import data.OrderModel;

public class MeatMenu extends BaseMenu {
    public MeatMenu(OrderModel model) {
        super("""
                1. Ham
                2. Beef
                3. Chicken
                """, model);
    }

    @Override
    public boolean isValid(String temp) {
        return true;
    }

    @Override
    public void handleChoice(String choice) {

    }


}
