/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Widya280323;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author WINDOWS 10
 */
public class GetInputFromKeyboard {
    public static void main(String[] args){
         BufferedReader dataIn=
                 new  BufferedReader (
                    new InputStreamReader(System.in));
         String name ="";
         int umur =0;
         try {
             System.out.print("Please enter your nsme :");
             name = dataIn.readLine();
             
             System.out.print("Age : ");
             umur =Integer.parseInt(dataIn.readLine()) ;
             
         }catch (IOException ex){
             System.out.println("Error!");
             
         }
         System.out.println("Hrllo "+ name +"!");
         System.out.println("Umur Anda "+ umur +"!");
                        
     }
}
