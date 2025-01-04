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
public class Remider_ex {
    public static void main(String args[])
    {
        int a,b,div,rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter frist value");
        a=sc.nextInt();
        System.out.println("Enter second value");
        b=sc.nextInt();
        
        div=a/b;
        rem=a%b;
        System.out.println("Division is : "+div);
        System.out.println("Reminder is : "+rem);
        
    }
}
