/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author DELL
 */
import java.util.Scanner;

public class Task2 {
      
     public static void displayVertical(String x[]){
         
         
         for(String string:x){
             System.out.println(string);
         }
     }
             
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("enter the sentence");
        Scanner obj=new Scanner(System.in);
        
        String b=obj.nextLine();
        
        String x[]=b.split(" ");
        for(int i=0; i<x.length; i++)
        {
            System.out.println(x[i]);
        }
        
        //calling the method display vertical here
        displayVertical(x);
        }
    
}
