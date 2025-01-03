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
public class If_example {
    public static void main(String args[])
    {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        x=sc.nextInt();
        if(x>200)
        {
            System.out.println("value is gretater than 200");
        }
        if (x<200)
        {
          System.out.println("value is less than 200");  
        }
        if(x==200)
        {
            System.out.println("value is equal to 200");
        }
}
}
