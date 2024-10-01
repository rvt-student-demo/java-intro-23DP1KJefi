package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.Scanner;

public class App 
{
  public static void main(String[] args) {
    divisibleByThreeInRange(3, 9);
  }
  public static void divisibleByThreeInRange(int beginning, int end) {
    for (int i=beginning; i<=end; i++){
      if(i%3==0){
        System.out.println(i);
      }
    }
  }
}
