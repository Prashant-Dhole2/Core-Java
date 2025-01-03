/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 *
 **/
import java.util.*;
public class Even_number {
    public static void main(String args[])
    {
        int k;
        Scanner uk=new Scanner(System.in);
        System.out.println("Enter the number");
        k=uk.nextInt();
        
        if(k%2==0)
        {
            System.out.println("it is a even number");
        }
   else
        {  System.out.println("it is odd number");
            }
        
    }
}
