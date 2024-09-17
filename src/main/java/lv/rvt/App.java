package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        
        int cipars1 = Integer.valueOf(scanner.nextLine());

        int cipars2 = Integer.valueOf(scanner.nextLine());

        int summa = cipars1 + cipars2;
        System.out.println("Summa ir: " + summa);
    }

}
