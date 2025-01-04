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
public class Add {
    public static void main(String args[])
    {
        int a,b,z;
        char k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter frist value");
        a=sc.nextInt();
        System.out.println("operator");
        k=sc.next().charAt(0);
        System.out.println("Enter second value");
        b=sc.nextInt();
        if(k=='+')
        {
            z=a+b;
              System.out.println("a and b sum is:"+z);
        }
        if(k=='-')
        {
            z=a-b;
              System.out.println("a and b sum is:"+z);
        }
        if(k=='*')
        {
            z=a*b;
            
            
        }
        char l='j';
          System.out.println("a and b sum is:"+l);
        
        
        
        
       
       
        
        
    }
}
