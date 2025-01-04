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
public class Root_example {
     public static void main(String args[])
    {
        int a;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        a=sc.nextInt();
        
        for(int i=1;i<=a;i++)
        {
            
            
            for(int j=1;j<=a;j++)
            {
                if(i*j==a)
                {
                    if(i==j)
                    {
                      System.out.println("Root is :"+i);
                    }
                }
            }
        }
      
        
    }
}
