/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Final_variable_example {
    final int xyz=100;
    void run()
    {
        xyz=400; // final variable value is constant
        
        System.out.println(xyz);
    }
    public static void main(String args[])
    {
        Final_variable_example ab=new Final_variable_example();
        ab.run();
    }
}
