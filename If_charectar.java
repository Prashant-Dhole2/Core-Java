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
public class If_charectar {
   public static void main(String args[]) 
   {
       char name;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter single charector");
       name=sc.next().charAt(0);
       if(name=='p')
       {
           System.out.println("its a p");
       }
       if(name!='p')
       {
           System.out.println("its not p");
       }
       
   }
}

