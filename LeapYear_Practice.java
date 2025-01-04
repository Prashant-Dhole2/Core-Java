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
public class LeapYear_Practice {
    public static void main(String args[])
    {
        int a;
        boolean leap;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year");
        a=sc.nextInt();
        if(a %4==0){
            leap=true;
        }else
        {
            leap=false;
        }
            if(a%100 == 0){
                leap=true;
            }else
            {
                leap=true;
            }
            
             if(a%400==0)
     
        {
            System.out.println("Leap year");
            
        
    }
    else
        {
            System.out.println("commen year");
        }
}
}