/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
import java.util.Scanner;
public class Assumtion_ex {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age: ");
        
        int value=sc.nextInt();
        assert value >=18:"not valid";
        
        System.out.println("Age is:"+value);
    }
}
