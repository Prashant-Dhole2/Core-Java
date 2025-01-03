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
public class Amstrong_number {
    public static void main(String args[])
    { 
        int sum,i,j,t,a;
        Scanner sk=new Scanner(System.in);
        System.out.println("Enter value");
        j=sk.nextInt();
        for(i=1;i<=j;i++)
        { 
            t=i;
            sum=0;
            while(t !=0)
            {
                a=t%10;
                sum +=a*a*a;
                t =t/10;
                
            }
            if(sum==i)
            {
                System.out.println(i);
            }
            
        }
        
    }
}
