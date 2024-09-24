package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        int valueOfGift = Integer.valueOf(scanner.nextLine());
        if (valueOfGift<5000){
            System.out.println("No tax!");
        } else if (valueOfGift>=5000 && valueOfGift<25000){
            double tax = (100+(valueOfGift-5000)*0.08);
            System.out.println("Tax: " + tax);
        } else if (valueOfGift>=25000 && valueOfGift<55000){
            double tax = (1700+(valueOfGift-25000)*0.10);
            System.out.println("Tax: " + tax);
        } else if (valueOfGift>=55000 && valueOfGift<200000){
            double tax = (4700+(valueOfGift-55000)*0.12);
            System.out.println("Tax: " + tax);
        } else if (valueOfGift>=200000 && valueOfGift<1000000){
            double tax = (22100+(valueOfGift-200000)*0.15);
            System.out.println("Tax: " + tax);
        } else if (valueOfGift>=1000000){
            double tax = (142100+(valueOfGift-1000000)*0.17);
            System.out.println("Tax: " + tax);
        }
        
    }

}
