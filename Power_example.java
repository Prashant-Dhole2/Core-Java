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
public class Power_example {
    public static void main(String args[])
    {
        int a,b,c=0;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Base value");
        a=sc.nextInt();
        System.out.println("Enter Power value");
        b=sc.nextInt();
        
        for(int i=1;i<=b;i++)
        {
            
            
            c+=a*a;
        }
      System.out.println(c);
        
    }
}
