package entities;

import org.springframework.stereotype.Component;

//@Component
public class Train {
    private String name = "Fast train";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
