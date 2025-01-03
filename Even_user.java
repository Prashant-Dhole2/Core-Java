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
public class Even_user {
    public static void main(String args[])
    { int p;
      Scanner sk=new Scanner(System.in);
      System.out.println("Enter value");
      p=sk.nextInt();
      
      for(int i=0;i<=p;i++)
      { 
          if(i%2==0)
          System.out.println(i);
      }
        
    }
}
