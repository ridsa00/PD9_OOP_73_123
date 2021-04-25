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
     /*   MyString str1 = new MyString();
        MyString str2 = new MyString();
         
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter first string: ");
        System.out.print( str1.getS1());
        System.out.print("Enter first string: ");
        System.out.print( str2.getS2());
        
        str1.Concatenation(str2);*/
    // String str1;
   //  String str2;
       MyString str1 = new MyString();
        MyString str2 = new MyString();
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter first string: ");
            str1.Concatenation(str2);
        System.out.print("Enter first string: ");
        
        
     //   String str3 = Concatenation(str1 , str2);
        
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

class MyString{
   String Concatenation(String s1 ){
       String s2 = null;
    
     String s3 = s1.concat(s2);
     System.out.println(s3);
     String s4 = s1 + s2;
     System.out.println(s4);
           
     return s4;
  }
}




