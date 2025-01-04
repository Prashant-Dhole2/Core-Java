/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
class Test {
    final void run()
    {
        System.out.println("Runing");
    }
}
public class Final_method extends Test{
    void run()
    {
        System.out.println("Extends runing");
    }
    public static void main(String args[])
    {
        Final_method obj=new Final_method();
        obj.run();
    }
}
