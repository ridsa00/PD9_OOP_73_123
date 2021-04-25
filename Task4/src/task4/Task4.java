/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

import java.util.Scanner;

/**
 *
 * @author ridsa(2020-CS-73)
 */
public class Task4 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
       int input = 0;
        String s1;
        String s2;
        String s3;
        int i = 0;
        char ch = 0;
        char a = 0;
        boolean flag;  

        
        MyString str3 = new MyString();
        Scanner obj = new Scanner(System.in);
        System.out.println(" 1- Enter 1 if u want to concatenate strings \n 2-Enter 2 if u want to convert string in upper case \n 3-Enter 3 if u want to convert string in lower case \n 4-Enter 4 if u want to find the length of the string \n 5-Enter 5 if u want to fing that whether a specific character exists in string or not \n");
        System.out.print(" Enter your number: ");
        input = obj.nextInt();
        
        
        
        if (input == 1) {
            obj = new Scanner(System.in);
            System.out.print("Enter first string: ");
            s1 = obj.nextLine();
            System.out.print("Enter second string: ");
            s2 = obj.nextLine();
            s3 = str3.Concatenation(s2, s1);
            System.out.println("Concatenated String is: " + s3);
        }
        
        
        else if(input == 2){
           obj = new Scanner(System.in);
           System.out.print("Enter the string: ");
           s1 = obj.nextLine();
           s2 = str3.Uppercase(s1);
           System.out.println("Conveted string in uper case is: " + s2);
        }

        
        else if(input == 3){
           obj = new Scanner(System.in);
           System.out.print("Enter the string: ");
           s1 = obj.nextLine();
           s2 = str3.Lowercase(s1);
           System.out.println("Conveted string in lower case is: " + s2);
        }
        
        
        else if(input == 4){
           obj = new Scanner(System.in);
           System.out.print("Enter the string: ");
           s1 = obj.nextLine();
           i = str3.Length(s1);
           System.out.println("Length of string is: " + i);
        }
        
        
         else if(input == 5){
           obj = new Scanner(System.in);
           System.out.print("Enter the string: ");
           s1 = obj.nextLine();
            System.out.print("Enter the character: ");
           s2 = obj.next();
           flag = str3.Contain(s1 , s2);
           System.out.println(flag);
        }
        
         else{
            System.out.println("Invalid Credentials...!!!");
         }
        
        
    }
 
}

/**
 * this is a new class MyString 
 * in which different methods are created
 */

class MyString {
    
    /**
     * method named as Concatenation is used to add two strings
     * @param s2
     * @param s1
     * @return string
     */

    String Concatenation(String s2, String s1) {

        String s3 = s1.concat(s2);
        s3 = s1 + " " + s2;
        return s3;
    }
    
    
    /**
     * method names as Uppercase is used to convert all 
     * alphabets of string in upper case
     * @param s1
     * @return string
     */
    
    
    String Uppercase(String s1) {

        String s2 = s1.toUpperCase();
        return s2;
    }
    
    
    /**
     * method names as Lowercase is used to convert all 
     * alphabets of string in lower case
     * @param s1
     * @return string
     */
    
    
    String Lowercase(String s1) {

        String s2 = s1.toLowerCase();
        return s2;
    }
    
    
    /**
     * method named as Length is used to measure 
     * the length of the input string
     * @param s1
     * @return integer length of input string
     */
    
    
    
    int Length(String s1 ){
      return s1.length();
       
    }
    
    
    /**
     * method named as Contain is used to find whether a character
     * exists in input string or not
     * @param s1
     * @param s2
     * @return Boolean value of flag
     */
    
    
    boolean Contain(String s1, String s2) {
        boolean flag = false;
        if (s1.contains(s2)) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

   
}



  
