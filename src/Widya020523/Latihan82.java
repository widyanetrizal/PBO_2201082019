/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Widya020523;

import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Latihan82 {
     public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b= Integer.parseInt(args[1]);

      Scanner in=new Scanner(System.in);

      //aritmatika tambah
      int sum;
      sum= a + b;

      //aritmatika kurang
      int difference;
      difference = a - b;

      //aritmatika kali
      int product;
      product = a * b;

      //aritmatika bagi
      int quotient;
      quotient = a / b;

      //output
      System.out.println("Sum       ="+sum);
      System.out.println("Different ="+difference);
      System.out.println("Product   ="+product);
      System.out.println("Quotient  ="+quotient);
    }
    
}
