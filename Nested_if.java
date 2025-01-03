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
public class Nested_if {
   public static void main(String args[])
   {
       int k;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the value");
       k=sc.nextInt();
       if(k<15)
       {
           System.out.println("the value is less than 15");
           if(k<10)
           {
              System.out.println("the value is less than 10");
           }
       }
       
   }
}
