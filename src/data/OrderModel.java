package data;

import java.util.ArrayList;

public class OrderModel extends BaseModel {
    ArrayList<OrderItem> list = new ArrayList<>();
    @Override
    public void save() {
        System.out.println("SAVING ORDER");
    }
}
