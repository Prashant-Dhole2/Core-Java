/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
import java.util.*;
public class prashant {
    int  Addition(int k,int j)
    {
       return k+j;
               
            
    }
    public static void main(String args[])
    { int a,b,c;
      
   
    prashant sk=new prashant();
       Scanner dk=new Scanner(System.in);
       System.out.println("Enter value");
        a=dk.nextInt();
        System.out.println("Enter double");
       b=dk.nextInt();
     
      c=sk.Addition(a,b);
      System.out.println(c);
    }
}