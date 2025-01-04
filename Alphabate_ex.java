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
public class Alphabate_ex {
    public static void main(String args[])
    {
        char a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter");
        a=sc.next().charAt(0);
        if((a>='a'&&a<='z') ||(a>='A'&&a<='Z'))
        {
            System.out.println(a+" is Alphabate");
        }
        else
        {
            System.out.println(a+" is not Alphabate");
        }
    }
}
