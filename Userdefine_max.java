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
public class Userdefine_max {
    public static void main(String args[])
    {  
         int p,q;
         Scanner dk=new Scanner(System.in);
         System.out.println("Enter frist value");
         p=dk.nextInt();
         System.out.println("Enter second value");
         q=dk.nextInt();
         
         findmax(p,q);
         
    }
    public static void findmax(int a,int b)
    {
        if(a>b)
        {
            System.out.println("Max value is:"+a);
        }
        else
        {
            System.out.println("Max value is:"+b);
        }
            
    }
}
