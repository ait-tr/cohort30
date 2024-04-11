package entities1;

public class Spring implements Season {
    String name = "Spring";
    @Override
    public String getSeason() {
        return name;
    }
}
