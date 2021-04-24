/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

import java.util.Scanner;
 

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
         System.out.println("Enter your string whose extra spaces,that you want to remove: ");
        String str = obj.nextLine();
        String newStr = ridMultipleBlank(str);
        
         System.out.println("New string with single spaces is: " + newStr); 
         obj.close();
         
    }
    
    /**
     *
     * @param s
     * @return
     */
    public static String  ridMultipleBlank(String s){
        s = s.replaceAll("( )+", " ");
        return s;
    }
 
}
