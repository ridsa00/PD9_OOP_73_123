/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

import java.util.Scanner;
import javax.swing.JOptionPane;
 

/**
 *
 * @author ridsa(2020-CS-73)
 */
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner obj = new Scanner(System.in);
        int input = 0;
        System.out.println("1-Enter 1 if you want to remove extra spaces within the input string \n 2-Enter 2 if you want to remove integers from the string \n 3-Enter 3 if u want to encrypt a string \n");
        System.out.print("Enter your number: ");
        input = obj.nextInt();

         
             if(input == 1){
                 
                obj = new Scanner(System.in);
                System.out.println("Enter your string whose extra spaces you want to remove: ");
                String str = obj.nextLine();
                String newStr = ridMultipleBlank(str);

                System.out.println("New string with single spaces is: " + newStr);
                
             }
             else if(input == 2){
                
                 obj = new Scanner(System.in);
                 System.out.println("Enter your string whose integers you want to remove: ");
                 String str2 = obj.nextLine();
                 String newStr2 = removeInteger(str2);

                 System.out.println("New string without integers is: " + newStr2);
                 
             }
             
              else if(input == 3){
                
                 obj = new Scanner(System.in);
                 System.out.print("Enter your string whom you want to  be encrypted: ");
                 String str2 = obj.nextLine();
                 String newStr3 = Encryption(str2);
                 
             }
             
              else{
                System.out.println("Invalid credentials...!!!");
              }
        
    }
    
    
    /**
     * static method named as ridMultipleBlank() is used to
     * replace multiple extra spaces between words
     * with a single white space
     * @param s
     * @return string
     */
    
    
    static String  ridMultipleBlank(String s){
        s = s.replaceAll("( )+", " ");
        return s;
    }
    
    /**
     * static method named as removeInteger() is used
     * to remove integers from the string
     * @param s
     * @return string
     */

    static String removeInteger(String s){
        s = s.replaceAll("[0123456789]", "");
        return s;
    }
    
    
    /**
     * static method named as Encryption() is used to
     * encrypt string and replace lengthy string with
     * the code words
     * @param s
     * @return string
     */
    
    
   static String Encryption(String s){
        int key = 6;
        char[] chars = s.toCharArray();
        System.out.print("Encrypted string is: " );
        for(char c : chars){
           c += key;
           System.out.print(c);         
        }
         System.out.print("\n");
         return s;
    }
    
  
}

