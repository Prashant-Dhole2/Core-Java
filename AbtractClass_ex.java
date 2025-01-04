/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
//abstact class
abstract class Moprations
{
    int a=50,b=60;
    //abstract method
    public abstract void add();
    
}
public class AbtractClass_ex extends Moprations{
    //defination of abstract method
    public void add()
    {
        System.out.println("Sum of a And b is"+(a+b));
        
    }
    public static void main(String args[])
    {
       AbtractClass_ex demo = new AbtractClass_ex();
        demo.add();
    }
    
}
