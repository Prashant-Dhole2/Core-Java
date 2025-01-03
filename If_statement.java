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
public class If_statement {
    public static void main(String args [])
    {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value");
        a=sc.nextInt();
        if(a>100)
        {
          System.out.println("the value is greater than 100");
               }
        else if(a==100)
        {
             System.out.println("value is  equal ");
        }
        else
        {
        System.out.println("The value is less than 100 ");
    }
    
}
}