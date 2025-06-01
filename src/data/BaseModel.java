package data;

import java.util.ArrayList;

public abstract class BaseModel {
    public IHoldsValue currentChoice;
    public ArrayList<Object> list;

    BaseModel() {
        list = new ArrayList<>();
    }

    public abstract void save();
}
