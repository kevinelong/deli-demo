package data;

import java.util.ArrayList;

public abstract class AddOn implements IHoldsValue, IHasName {
    String name;
    Product value = null;
    ArrayList<Product> list;

    AddOn(String name) {
        this.name = name;
        this.value = null;
        this.list = null;
    }
    AddOn(String name, ArrayList<Product> list) {
        this.name = name;
        this.value = null;
        this.list = list;
    }

    public ArrayList<Product> getList() {
        return list;
    }

    public String getName() {
        return this.name;
    }
    @Override
    public Object getValue() {
        return null;
    }

    @Override
    public Object setValue(Object value) {
        return null;
    }
}
