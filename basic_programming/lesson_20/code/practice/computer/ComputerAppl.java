package practice.computer;

import practice.computer.model.Computer;

public class ComputerAppl {
    public static void main(String[] args) {

        Computer comp1 = new Computer();

        comp1.setCpu("Intel");
        comp1.setRam(-16);
        comp1.setSsd(-512);
        System.out.println(comp1.toString());

        comp1.computerTurnOn();
        System.out.println(comp1);

        Computer comp2 = new Computer("i7", 16, 512, "Acer", "Off");

    }
}
