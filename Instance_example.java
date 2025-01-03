/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Instance_example {
    public static void main(String args[])
    {
        Instance_example ie=new Instance_example();
        int c;
        c=ie.addition_fun(12,10);
        System.out.println("addition is:"+c);
      
    }
    public int addition_fun(int a,int b)
    {
        int z=a+b;
        
        return z;
    }
}
