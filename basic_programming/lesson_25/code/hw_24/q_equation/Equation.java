package hw_24.q_equation;

public class Equation {
    Double a;
    Double b;
    Double c;

    public Double root1(Double a, Double b, Double c){
        Double d = b * b - 4 * a * c;
        Double x1 = null;
        if (d < 0) {
            System.out.println(" No root");
        } else {
            x1  = (- b + Math.sqrt(d)) / (2 * a);
            System.out.println("x1 = " + x1);
        }
        return x1;
    }

    public Double root2(Double a, Double b, Double c){
        Double d = b * b - 4 * a * c;
        Double x2 = null;
        if (d < 0) {
            System.out.println(" No root");
        } else {
            x2  = (- b - Math.sqrt(d)) / (2 * a);
            System.out.println("x2 = " + x2);
        }
        return x2;
    }
}
