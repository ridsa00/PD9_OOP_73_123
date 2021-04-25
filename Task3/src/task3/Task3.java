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
        int input=0;
         System.out.println("1-Enter 1 if you want to remove extra spaces within the input string \n 2-Enter 2 if you want to remove integers from the string \n");
         input = obj.nextInt();
             if(input == 1){
                obj = new Scanner(System.in);
                System.out.println("Enter your string whose extra spaces,that you want to remove: ");
                String str = obj.nextLine();
                String newStr = ridMultipleBlank(str);

                System.out.println("New string with single spaces is: " + newStr);
                
             }
             if(input == 2){
             
             }
            
        
        
         
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
