
import java.util.Scanner;

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
public class Factor_ex_Practice {
    public static void main(String args[])
 {
     int a;
   int c =1;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter no");
     a=sc.nextInt();
     for(int i=1;i<=a;i++){
        c*=i;

      } 
     System.out.println(c);
      }
    
}
