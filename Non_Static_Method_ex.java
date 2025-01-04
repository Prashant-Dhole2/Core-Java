/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Non_Static_Method_ex {
    int x=m1();
    int y=20;
    Non_Static_Method_ex()
    {
        System.out.println("Cunstuctor Start");
        System.out.println("Cunstuctor x : "+x);
        System.out.println("Cunstuctor y : "+y);
        x=30;
        y=m2();
        System.out.println("Cunstuctor end");
     
    }
    //create non static block
    {
    System.out.println("Non static block start");
    System.out.println("Non static block x : "+x);
    System.out.println("Non static block y : "+y);
    System.out.println("Non static block end");
    
    
}
    int m1(){
        System.out.println("m1 () exicuted");
        return 10;
    }
    public static void main(String args[])
    {
        System.out.println(" main start ");
        Non_Static_Method_ex nsb=new Non_Static_Method_ex();
        System.out.println(" x : "+nsb.x);
        System.out.println(" y : "+nsb.y);
        System.out.println(" main end ");
    }
    int m2()
    {
        System.out.println("m2 exicuted ");
        return 40;
    }
}
