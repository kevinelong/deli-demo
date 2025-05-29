import data.OrderModel;
import ui.MainMenu;

public class DeliApp {
    public static void main(String[] args) {

        System.out.println("Welcome!!!");

        var model = new OrderModel();
        var root = new MainMenu(model);
        root.show(); //will loop indefinitely until 0 exit is chosen

        System.out.println("Thank you for using Deli!");

    }
}
