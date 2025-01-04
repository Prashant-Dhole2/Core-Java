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
public class If_ex2 {
    public static void main(String args[])
    {
        int a;
        Scanner sc=new Scanner(System.in);
       a=sc.nextInt();
       
       if(a<100){
           
           System.out.println("this value is less than 100");
           
       }
       else if(a<150) 
       {
           System.out.println("this value is greter than 100 and less than 150");
       }
       else if(a<200)
       {
            System.out.println("this value is greter than 150 and less than 200");
       }
       else
       {
           System.out.println("this value is greter than 200");
       }
    }
    
}
