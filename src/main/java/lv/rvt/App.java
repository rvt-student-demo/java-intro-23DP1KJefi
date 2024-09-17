package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        
        int number = 4;
        if (number==1){
            System.out.println("The number is one");
        } else if (number==2){
            System.out.println("The number is two");
        } else if (number==3){
            System.out.println("The number is three");
        } else {
            System.out.println("Something else");
        }
    }

}
