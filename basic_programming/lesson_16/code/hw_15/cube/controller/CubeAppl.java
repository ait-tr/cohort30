package hw_15.cube.controller;

import hw_15.cube.model.Cube;

public class CubeAppl {
    public static void main(String[] args) {
        Cube c1 = new Cube(10);
        System.out.println("Perimeter: " + c1.perimetr(10));
        System.out.println("Square: " + c1.square(10));
        System.out.println("Volume: " + c1.volume(10));

        Cube c2 = new Cube(50);
        System.out.println("Perimeter: " + c1.perimetr(50));
        System.out.println("Square: " + c1.square(50));
        System.out.println("Volume: " + c1.volume(50));

    }
}
