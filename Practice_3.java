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
public class Practice_3 {
    public static void main(String args[])
    {
       int a,b,c,d;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter anumber");
        a=sc.nextInt();
        System.out.println("enter second number");
        b=sc.nextInt();
        c=a/b;
        d=a%b;
        System.out.println("divide is : "+c);
         System.out.println(" reminder  is : "+d);
        
    }
    
}
