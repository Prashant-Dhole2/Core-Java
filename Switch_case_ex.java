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
public class Switch_case_ex {
    public static void main(String args[])
    {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.println("enater a value");
        x=sc.nextInt();
        
        switch(x)
        {
            case 100:
                System.out.println("Enterd value is 100");
                break;
            case 150:
                System.out.println("Enter valu is 150");
                break;
            case 200:
                System.out.println("Enterd value is 200");
                break;
            default:
                System.out.println("Enterd value is Greter than 200");
                
                
            
        }
    }
    
}
