package practice.solution;

public class AnyNumberSolution extends RuntimeException{

    String message;

    public AnyNumberSolution(){
        super();
    }

    public AnyNumberSolution(String message) {
        super(message);
    }
}
