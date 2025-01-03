/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
class Singleton
{
    private static Singleton single_instance=null;
    public String s;
    private Singleton()
    {
       s="Helllo its Singleton class part";
    }
    public static Singleton Singleton()
    {
        if(single_instance==null);
        {
            single_instance=new Singleton();
        }
        return single_instance;
    }       
     
        
}
public class Singleton_ex { 
    public static void main(String args[])
 {  Singleton x= Singleton.Singleton();
    Singleton y= Singleton.Singleton();
    Singleton z= Singleton.Singleton();
    
    x.s=(x.s).toLowerCase();
    System.out.println("String From x is "+x.s);
    System.out.println("String From y is "+y.s);
    System.out.println("String From z is "+z.s);
    System.out.println("\n");
    
    z.s=(z.s).toLowerCase();
    System.out.println("String From x is "+x.s);
    System.out.println("String From y is "+y.s);
    System.out.println("String From z is "+z.s);
    System.out.println("\n");
    
  }
   
}
