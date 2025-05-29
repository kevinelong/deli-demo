package ui;

import data.OrderModel;

public class CheeseMenu extends BaseMenu {
    public CheeseMenu(OrderModel model) {
        super("""
                1. Swiss
                2. Gouda
                3. Cheddar
                0. <-- Back
                """, model);
    }

    @Override
    public boolean isValid(String temp) {
        return true;
    }

    @Override
    public void handleChoice(String choice) {
        model.currentChoice.setValue(choice);
    }
}
