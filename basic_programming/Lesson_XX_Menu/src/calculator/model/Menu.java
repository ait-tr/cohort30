package calculator.model;

import java.util.Scanner;

public class Menu {
    String action1;
    String action2;
    String action3;
    String action4;

    public Menu(String action1, String action2, String action3, String action4) {
        this.action1 = action1;
        this.action2 = action2;
        this.action3 = action3;
        this.action4 = action4;
    }

    public String getAction1() {
        return action1;
    }

    public void setAction1(String action1) {
        this.action1 = action1;
    }

    public String getAction2() {
        return action2;
    }

    public void setAction2(String action2) {
        this.action2 = action2;
    }

    public String getAction3() {
        return action3;
    }

    public void setAction3(String action3) {
        this.action3 = action3;
    }

    public String getAction4() {
        return action4;
    }

    public void setAction4(String action4) {
        this.action4 = action4;
    }

    @Override
    public String toString() {
        return "1: " + action1 + " | " + "2: " +  action2 + " | " + "3: " + action3 + " | " +"4: " + action4;
    }

    public int chooseAction(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your choice: ");
        return scanner.nextInt();
    }


}
