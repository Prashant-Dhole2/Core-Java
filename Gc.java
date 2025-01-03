
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Gc {
    public static void main(String[] args) throws InterruptedException
    {
        Gc g1=new Gc();
        Gc g2=new Gc();
        
        g1=null;
        
        System.gc(); //garbage collector method gc();
        
        g2=null;
        Runtime.getRuntime().gc();//garbage collector method gc();
    }
    @Override 
    protected void finalize() throws Throwable
    {
        System.out.println("Garbage Collector Called");
         System.out.println("object garbage collector:"+this);
    }
}
