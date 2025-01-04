/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Parameterise_cunstructor_ex {
    Parameterise_cunstructor_ex (int i,String s)
    {
        System.out.println("Roll No. "+i+" and name "+s);
    }
    public static void main(String args[])
    {
        Parameterise_cunstructor_ex pc = new Parameterise_cunstructor_ex(50,"sachin"); 
        Parameterise_cunstructor_ex  pc2 = new Parameterise_cunstructor_ex (51,"Pritesh");
    }
    
}
