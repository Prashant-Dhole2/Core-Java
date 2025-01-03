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
public class Sum_Two_natural {
    public static void main(String args[])
    {  int a,b,c=0;
    Scanner dk=new Scanner(System.in);
    System.out.println("Enter frist value");
    a=dk.nextInt();
    System.out.println("Enter second value");
    b=dk.nextInt();
    
    while(a<=b)
    {
        c=a+c;
        a++;
    }
       System.out.println("sum:"+c); 
    }
}
