/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
abstract class Mopration
{
    int a=50,b=60;
    // abstract method
    public abstract void add();
}
public class AbstractClass_ex extends Mopration
{
    // defination of abstract class
    public void add()
    {
        System.out.println("sum of a and b is "+(a+b));
    }
    public static void main(String args[])
    {
         AbstractClass_ex demo=new  AbstractClass_ex();
         demo.add();
    }
}
