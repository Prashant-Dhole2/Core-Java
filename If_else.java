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
public class If_else {
    public static void main(String args[])
    {
        int j;
        Scanner uk=new Scanner(System.in);
        System.out.println("Enter the value ");
        j=uk.nextInt();
        if(j%2==0)
        {
            System.out.println("it is even number");
        }
        else
        {
            System.out.println("it is odd number");
        }
    }
}
