/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
abstract class Mopration //abstract class
{
    int a=50,b=60;
    public abstract void add(); //abstract method
}
public class Abstract_class_ex extends Mopration
{  //defination of abstract method
    public void add()
    {
        System.out.println("sum of a and b is:"+(a+b));
    }
    public static void main(String args[])
    {
        Abstract_class_ex Demo= new Abstract_class_ex();
        Demo.add();
    }
}
