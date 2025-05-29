package data;

public interface IHoldsValue {
    Object value = null;
    public Object getValue();
    public Object setValue(Object value);//return object ref for chaining
}
