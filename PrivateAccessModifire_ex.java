/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
class A
{
    private int data=100;
    private void msg()
    {
        System.out.println("Java rograming");
    }
}
public class PrivateAccessModifire_ex {
    public static void main(String args[])
    {
        A obj=new A();
         obj.msg();
        System.out.println(obj.data);
       
    }
}
