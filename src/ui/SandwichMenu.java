import java.util.Scanner;

public class SandwichMenu extends BaseMenu {
    Scanner in = new Scanner(System.in);
    public boolean isValid(String temp){
        //TODO make real
        return true;
    }
    public void handleChoice(String choice){
        //TODO make real
        return;
    }
    public SandwichMenu(OrderModel model){
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
