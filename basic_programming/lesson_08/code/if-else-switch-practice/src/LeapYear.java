import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Leap Yar");
        //write a program to determine if a year is a leap year
//        Для того, чтобы быть високосным год должен: делится без остатка на 4 и либо не должен
//        делится без остатка на 100, либо если он делится на 100, то он должен делится также на 400.

        Scanner in=new Scanner (System.in);//turn on Scanner

        System.out.println("Determining if a year is a leap year .");
        System.out.println("Enter year:")   //message to user
        int year = in.nextInt();
        if (year % 4 == 0 & year % 100 != 0) {
            System.out.println("Is a high year");
        }
        Else if (year % 100 == 0 $ year %400 == 0 ){
        //Solution korrekt  parentaler
            System.out.println("The year is high");
        } else{
            System.out.println("The year is not high");
        }
    }
}


    }
            }
