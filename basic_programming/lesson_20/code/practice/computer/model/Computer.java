package practice.computer.model;

public class Computer {
    public String cpu;
    public int ram;
    public int ssd;
    public String brand;

    @Override
    public String toString() {
        return "Brand: " + brand + ", CPU: " + cpu + ", RAM: " + ram + ", SSD: " + ssd + ", indicator: ";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Computer)) {
            return false;
        }
        Computer other = (Computer) obj;
        return brand.equals(other.brand) && cpu.equals(other.cpu) && ram == other.ram && ssd == other.ssd;
    }


}
