package configs;

import entities.Car;
import entities.Plane;
import entities.Train;
import entities1.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
public class MyConfig {

    @Bean
    public Car getCar(){
        return new Car();
    }

    @Bean
    public Train getTrain(){
        return new Train();
    }

    @Bean("plane-super")
    public Plane getPlane(){
        return new Plane();
    }

    @Bean
    public Season getSeason(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the season you like: 1 for Winter, 2 for Spring, " +
                            "3 for Summer, 4 for Autumn");
        int seasonNum = scanner.nextInt();
        switch (seasonNum){
            case 1: return new Winter();
            case 2: return new Spring();
            case 3: return new Summer();
            case 4: return new Autumn();
            default:return null;
        }
    }




}
