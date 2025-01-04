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
public class Addition {
    void msg()
    {
        int i;
        int a,sum=0;
        Scanner ob=new Scanner(System.in);
        a=ob.nextInt();
        for(i=0;i<=a;i++)
        {
           sum +=i;
            
        }
        System.out.println(sum);
    }
    
}
