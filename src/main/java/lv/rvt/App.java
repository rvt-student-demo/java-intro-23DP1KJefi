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

        int cipars3 = Integer.valueOf(scanner.nextLine());

        int summa = cipars1 + cipars2 + cipars3;
        System.out.println("Summa ir: " + summa);
        int reizinajums = cipars1 * cipars2 * cipars3;
        System.out.println("Reizinajums ir: " + reizinajums);
        double videjais = (double) (cipars1 + cipars2 + cipars3) / 3;
        System.out.println("Videjais ir: " + videjais);
    }

}
