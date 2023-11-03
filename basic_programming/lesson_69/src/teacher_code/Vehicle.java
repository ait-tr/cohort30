package teacher_code;

public class Vehicle {

    private int wheels;
    private  static Vehicle vehicle = null;

    private Vehicle() {
    }

    protected static Vehicle init() {
        if (vehicle == null)  {
            vehicle = new Vehicle();
        }
        return vehicle;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheels=" + wheels +
                '}';
    }
}
