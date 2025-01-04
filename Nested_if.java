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
        
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value");
        x=sc.nextInt();
        
        if(x<100)
        {
            System.out.println("enter value is less than 100");
            
            if(x>50)
            {
                System.out.println("but Greter than 50");
            }
            
        }else
        {
            System.out.println("value is greter than 100");
        }
    }
    
}
