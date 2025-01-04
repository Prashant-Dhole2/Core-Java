/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Final_VAriable_ex {
    final int data=50;
    void run()
    {
        data =60;
    }
    public static void main(String args[])
    {
        Final_VAriable_ex  obj=new Final_VAriable_ex ();
        obj.run();
    }
    
}
