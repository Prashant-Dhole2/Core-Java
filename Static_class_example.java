/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Static_class_example {
    public static class Demo
       {
        public void show()
        {
            System.out.println("java");
        }
                
       }
    public static void main(String args[])
    {
        Static_class_example.Demo obj=new Static_class_example.Demo();
        obj.show();
    }
}
