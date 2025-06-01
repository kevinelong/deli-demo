package data;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Collectors;

public class OrderModel extends BaseModel {
    public ArrayList<OrderItem> list;
    public OrderModel(){
        super();
        list = new ArrayList<>();
    }
    public double getTotal() {
        double total = 0;
        for (OrderItem item : list) {
            total += item.quantity * item.product.price;
        }
        return total;
    }

    @Override
    public String toString() {
        return String.format("""
                        ORDER:
                        %s
                        TOTAL: $%.2f
                        """,
                list.stream().map(Object::toString).collect(Collectors.joining("\n")),
                getTotal()
        );
    }

    @Override
    public void save() {
        System.out.println("SAVING ORDER");
        FileWriter fw = null;
        try {
            fw = new FileWriter("ORDER_" + (new Date()).toString());
            fw.write(this.toString());
        } catch (IOException e) {
            System.out.println("ERROR: Failed to write file. " + e.getMessage());
        }
    }
}
