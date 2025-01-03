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
public class If_user {
    public static void main(String args[])
  {
      int a,b;
      Scanner sc =new Scanner (System.in);
      System.out.println("Enter frist value");
      a=sc.nextInt();
      System.out.println("Enter second value");
      b=sc.nextInt();
      if (a>b)
        {  
            System.out.println(a+" is greater than "+b);
              }
    
      if(a==b)
        {
             System.out.println("value is equal");
               }
      if (a<b)
        {
             System.out.println(a+" is less than "+b);
               }
}
}
