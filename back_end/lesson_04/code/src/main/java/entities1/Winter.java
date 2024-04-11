package entities1;

public class Winter implements Season{

    String name = "Winter";
    @Override
    public String getSeason() {
        return name;
    }
}
