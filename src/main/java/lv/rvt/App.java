package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in); 
        int sumOfNumbers = 0;
        int numberOfNumbers = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number==0) {
                break;
            } else {
                 numberOfNumbers = numberOfNumbers + 1;
                 sumOfNumbers = sumOfNumbers + number;
            }
        }
        System.out.println("Number of numbers: " + numberOfNumbers);
        System.out.println("Sum of the numbers: " + sumOfNumbers);
    }

}
