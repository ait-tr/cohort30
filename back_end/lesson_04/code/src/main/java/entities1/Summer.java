package entities1;

public class Summer implements Season {
    String name = "Summer";

    @Override
    public String getSeason() {
        return name;
    }
}
