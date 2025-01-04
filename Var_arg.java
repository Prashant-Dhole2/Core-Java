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
        System.out.println("number of arguments : " +a.length);
        for(int i:a)
        {
            System.out.println(i+ " ");
            
        }
        System.out.println();
    }
        public static void main(String args[])
        {
            fun(1,20,30,40,80,50,70);
        }
    }
            
  

