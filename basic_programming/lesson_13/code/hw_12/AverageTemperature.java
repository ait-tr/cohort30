package hw_12;

public class AverageTemperature {
    public static void main(String[] args) {

        int[] temperature = { 15 , 18, 17, 22, 25, 28, 26 };
        double sum = 0;
        double averageTemp = 0;

        for (int i = 0; i < temperature.length; i++) {
            sum = sum + temperature[i];
        }
        averageTemp = sum / temperature.length;

        System.out.println("Average temp is:  " + averageTemp);
        System.out.printf("Average temp is: %.2f ", averageTemp);
    }
}
