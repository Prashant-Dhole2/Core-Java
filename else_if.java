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
public class else_if {
    public static void main(String args[])
    {
        int mark;
        Scanner mr=new Scanner(System.in);
        System.out.println("Enter the mark");
        mark=mr.nextInt();
        if(mark>=40&&mark<=60)
        {
           System.out.println("student is pass"); 
        }
        else if(mark>60&&mark<=75)
        {
           System.out.println("student is pass in frist class ");
        }
        else if(mark>75&&mark<=100)
        {
           System.out.println("student is pass in distriction "); 
        }
         else if(mark<40)
        {
           System.out.println("student is fail "); 
        }
        else 
         {
             System.out.println("invalid mark ");
         }
    }
}

