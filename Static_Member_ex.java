/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Static_Member_ex {
    static int a=100;
    public static void main(String args[])
            {
                print();
                System.out.println("Main Method Has Finished its excution");
            }
    static 
   {
        System.out.println(a);
        print();
        System.out.println("Inside first static block");
}
    public  static void print(){
        System.out.println(b);
        
    }
    static {
        System.out.println("Inside second static block");

        
    }
    static int b=200;
}
