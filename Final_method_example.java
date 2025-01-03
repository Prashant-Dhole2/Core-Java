/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
class test
{
   final void run()
    {
        System.out.println("Running");
    }
}
public class Final_method_example extends test
{
    void run() //final method is constsnt
    {
     System.out.println("extends running");
    }
 public static void main(String args[])
    {
       Final_method_example ab=new Final_method_example();
       ab.run();

        
    }
}
