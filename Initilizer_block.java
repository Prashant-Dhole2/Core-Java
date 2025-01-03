/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Initilizer_block {
    
    {
        System.out.println("this code exeute before every constructor");
    }
    Initilizer_block()
    {
    System.out.println("Default constructor");
    }  
     Initilizer_block(int i)
    {
        System.out.println("parameterize constructor");
    }
    public static void main(String args[])
    {
        Initilizer_block ib1,ib2;
        ib1=new Initilizer_block();
        ib2=new Initilizer_block(0);
    
    }
    
}
