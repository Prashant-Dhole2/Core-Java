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
public class Instance_max {
    public static void main(String args[])
    {
        Instance_max ie= new Instance_max();
        int k,p,q;
        Scanner sk=new Scanner(System.in);
        System.out.println("Enter frist value");
        p=sk.nextInt();
        System.out.println("Enter second value");
        q=sk.nextInt();
        k=ie.max_ob(p,q);
    }
    public int max_ob(int a, int b)
    {
        if(a>b)
        {
            System.out.println("max value is:"+a);
        }
        else
        {
            System.out.println("max value is:"+b);
        }
        return 0;
    }
}
