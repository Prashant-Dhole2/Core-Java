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
public class Loan_calculatar {
    public static void main(String args[])
    {   int A,R1,R2,R3,M1,M2,M3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Loan Amonunt");
         A=sc.nextInt();
         M1=A/10;
         R1=A-M1;
         M2=R1/10;
         R2=R1-M2;
         M3=R2/10;
         R3=R2-M3;
        System.out.println("Here is monthaly payment shedule:");
        System.out.println("Month 1:");
        System.out.println("Payment:10%of "+A+"="+M1);
        System.out.println("Remaining amount:"+R1);
        
        System.out.println("\nMonth 2:");
        System.out.println("Payment:10%of "+R1+"="+M2);
        System.out.println("Remaining amount:"+R2);
       
        System.out.println("\nMonth 3:");
        System.out.println("Payment:10%of "+R2+"="+M3);
        System.out.println("Remaining amount:"+R3);
    }
}
