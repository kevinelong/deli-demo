package ui;

import data.AddOn;
import data.OrderModel;

public class AddOnMenu extends BaseMenu {
    protected AddOn addOn;

    public AddOnMenu(OrderModel model, AddOn addOn) {
        super(model);
        this.addOn = addOn;
    }

    public String getMenuText() {
        //TODO
        return "Add On";
    }

    @Override
    public boolean isValid(String temp) {
        return false;
    }

    @Override
    public void handleChoice(String choice) {

    }


}
