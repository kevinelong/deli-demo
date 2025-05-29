import data.OrderModel;
import ui.MainMenu;

public class DeliApp {
    public static void main(String[] args) {
        var model = new OrderModel();
        System.out.println("Welcome!!!");
        var root = new MainMenu(model);
        root.show();
    }
}
