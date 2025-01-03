/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Static_block {
    public static void main(String args[])
    {
        System.out.println(Test.i);
    }
   }
   class Test
    {
        static int i;
        
        static
        {
         i=10;
          
          System.out.println("This is static block");  
                  
        }
    }
 

