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
public class If_else_ex {
    public static void main(String args[])
    {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        a=sc.nextInt();
        
        if(a%2==0)
        {
            System.out.println("this number is even no. ");
            
        }
        else
        {
            System.out.println("this number is odd number ");
        }
    }
}
