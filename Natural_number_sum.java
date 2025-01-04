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
public class Natural_number_sum {
    public static void main(String args[])
    {
        int a,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        a=sc.nextInt();
        for(int i=0;i<=a;i++)
        {
            sum+=i;
            
        }
        System.out.println("Sum is "+sum);
    }
}
