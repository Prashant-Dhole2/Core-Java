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
public class Leap_year {
    public static void main(String args[])
    {
        int a;
        boolean leap=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year");
        a=sc.nextInt();
        if(a%4==0)
        {
            if(a%100==0)
            {
                if(a%400==0)
                {
                   leap=true;
                }
                else
                {
                    leap=false;
                }
            }
            leap=true;
        }
        else
        {
          leap=false;       
        }
        if(leap)
        {
             System.out.println(a+" is a Leap year");
        }
        else
        {
            System.out.println("This is not leap year");
        }
    }
}
