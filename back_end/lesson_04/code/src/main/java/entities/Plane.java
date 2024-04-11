package entities;

import org.springframework.stereotype.Component;

//@Component("plane-super")
public class Plane {
    private String name = "Boeing";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
