/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

/**
 *
 * @author amn(2020-CS-123)
 */
import java.util.Scanner;
public class Task1 {

    /**
     * @param args the command line arguments
     */
    static int wordCounter(String a)
    {
        int counter=0;
        char ch[]=new char[a.length()];
        for(int i=0; i<a.length(); i++)
        {
            ch[i]= a.charAt(i);  
                if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                    counter++;  
            
        }
         return counter;       
    }
    static int vowelCounter(String a)
    {
        int counter=0;
        char ch[]=new char[a.length()];
        for(int i=0; i<a.length(); i++)
        {
            ch[i]= a.charAt(i);
            if(ch[i] == 'a'|| ch[i]=='e'|| ch[i]=='i' || ch[i]=='o'|| ch[i]=='u')
            {
                counter++;
            }
            
                    
        }
        return counter;
    }
    static int punctuationCounter(String a)
    {
        int counter=0;
        char ch[]=new char[a.length()];
        for(int i=0; i<a.length(); i++)
        {
          ch[i]= a.charAt(i);
          if(ch[i]=='!'||ch[i]=='?'|| ch[i]==','|| ch[i]=='.'|| ch[i]==';')
          {
              counter++;
          }
        }
        return counter;
        
    }
     static boolean findSubString(String a)
    {
      System.out.println(a.contains("the"));
       return true;
        
    }
    
            
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("enter the string");
        Scanner obj=new Scanner(System.in);
        
        String a=obj.nextLine();
        
        System.out.println("word counter of given string gives:"+wordCounter(a));
        System.out.println("vowel counter of given string gives:"+vowelCounter(a));
        System.out.println("punctuation counter of given string gives:"+punctuationCounter(a));
        System.out.println("whether the is part of string:"+ findSubString(a));
        
    }
    
}
