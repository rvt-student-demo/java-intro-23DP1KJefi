package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in); 
        int number = Integer.valueOf(scanner.nextLine());
        for (int i = number; i < 101; i++) {
            System.out.println(i);
        }
    }

}
