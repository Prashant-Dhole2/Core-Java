/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class LCM_ex {
    public static void main(String args[])
    {
        int n1=8,n2=12,lcm;
        
        lcm=(n1>n2)?n1:n2;
        
        while(true)
        {
            if(lcm%n1==0 && lcm%n2==0)
            {
                System.out.println("The LCM of "+n1+" and "+n2+" is "+lcm);
                break;
            }
            lcm++;
        }
        
    }
}
