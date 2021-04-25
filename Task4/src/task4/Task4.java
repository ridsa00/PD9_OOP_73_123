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
        System.out.println(" 1- Enter 1 if u wan5t to concatenate strings \n 2-Enter 2 if u want to convert string in upper case \n 4-Enter 4 if u want to find the length of the string");
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
        
        
    }
 
}

  
 /* class MyString {

     String s1;
     String s2;

    public String getS1() {
        return s1;
    }

    public void setS1(String str1) {
        this.s1 = str1;
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String str2) {
        this.s2 = str2;
    }

    
       String Concatenation(MyString s3){

          //String Concatenation
           s1.getString()+s2.getString();
           s3 = s1.concat(s2);
           System.out.println(s3);
           String s4 = s1 + s2;
           System.out.println(s4);
           
           return s4;
       }

       String getString(){
          String s1;
          String s2;
          return s1, s2;
       }
        
    }
  
*/

class MyString {

    String Concatenation(String s2, String s1) {

        String s3 = s1.concat(s2);
        s3 = s1 + " " + s2;
        return s3;
    }
    
    String Uppercase(String s1) {

        String s2 = s1.toUpperCase();
        return s2;
    }
    
    String Lowercase(String s1) {

        String s2 = s1.toLowerCase();
        return s2;
    }
    
    int Length(String s1 ){
      return s1.length();
       
    }
    
    boolean Contain( String s1 , String s2 ){
        boolean flag = false ;
      // for( int i=0 ; i<s1.length() ; i++){
      
          if(s1.contains(s2)){
            // System.out.println("is string");
            flag = true;
          } 
          else{
          //  System.out.println("is not string");
          flag = false;
          }
       return  flag;
    }
    
   
}



  
