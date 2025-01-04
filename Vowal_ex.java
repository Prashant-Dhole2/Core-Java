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
public class Vowal_ex {
    public static void main(String args[])
    {
        char a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Char");
        a=sc.next().charAt(0);
        
      switch(a)
       {
           case 'a':
           System.out.println(a+" is vowel");	
           break;
           case 'A':
           System.out.println(a+" is vowel");
           break;	 
           case 'e':
           System.out.println(a+" is vowel");	
           break;
           case 'E':
           System.out.println(a+" is vowel");
           break;
           case 'i':
           System.out.println(a+" is vowel");	
           break;
           case 'I':
           System.out.println(a+" is vowel");
           break;		
           case 'o':
           System.out.println(a+" is vowel");	
           break;
           case 'O':
           System.out.println(a+" is vowel");
           break;
           case 'u':
           System.out.println(a+" is vowel");	
           break;
           case 'U':
           System.out.println(a+" is vowel");
           break;	
           default:
           System.out.println(a+" is Consonant");   
       }
        
    }
}
