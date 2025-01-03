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
public class Userdefine_method_example {
    public static void main(String args[])
    {
        int num;
        Scanner sk=new Scanner(System.in);
        System.out.println("Enter value");
        num=sk.nextInt();
        even_odd(num);
    }
    public static void even_odd(int num)
    {
        if(num%2==0)
        {
            System.out.println("it is even number");
        }
        else
        {
            System.out.println("it is odd number");
        }
    }
}
