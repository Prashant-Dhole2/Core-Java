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
public class Switch_case_ex2 {
    public static void main(String args[])
    {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your persentaage 10th range ");
        a=sc.nextInt();
        
        switch(a)
        {
            case 90:
                System.out .println("First class");
                break;
            case 80:
                System.out.println("2nd class");
                break;
            case 70:
                System.out.println("3rd class");
                break;
            case 60:
                System.out.println("4th class");
                break;
            case 50:
                System.out.println("5th class");
                break;
            case 30:
                System.out.println("Fail");
                break;
            default:
                System.out.println("this is not eligible");
            
        }
    }
    
}
