/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */import java.util.*;
public class Float_if {
    public static void main(String args[])
    {
       double p,q;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter frist value");
       p=sc.nextDouble();
        System.out.println("second frist value");
        q=sc.nextDouble();
        if(p>q)
        {
             System.out.println(p+" valueis greater than "+q);
        }
       if (p==q)
        {
             System.out.println(p+" vakue is equal to "+q);
        }
       if(p<q)
        {
             System.out.println(p+" value is less than "+q);
        }
    }
}
