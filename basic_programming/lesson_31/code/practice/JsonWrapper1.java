package practice;

public class JsonWrapper1 {

    // поле
    private Object value;

    public JsonWrapper1(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{value: " + value  + "}";
    }
}
