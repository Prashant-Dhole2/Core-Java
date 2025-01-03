/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Var_arg {
    static void fun(int ...a)
    {
        System.out.println("Number of Arguments :"+a.length);
    
    for(int i:a)
    {
        System.out.println(i+" ");
    }
    System.out.println();
    }
    public static void main(String args[])
    {
        fun(10,20,30,40,50,60,70,80);
    }
}
