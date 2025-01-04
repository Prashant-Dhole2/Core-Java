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
public class ASCII_value {
    public static void main(String args[])
    {
        char name;
        Scanner dk=new Scanner(System.in);
        System.out.println("Enter Charectar");
        name=dk.next().charAt(0);
        
        int b=name;
        System.out.println(" ASCII number is :"+b);
    }
}
