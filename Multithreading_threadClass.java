/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
class MultithreadingDemo extends Thread
{
    public void run()
    {
        try{
            System.out.println("Thread "+Thread.currentThread().getId()+" is a runing");
        }catch(Exception e)
        {
            System.out.println("Exception is caught");
        }
    }
}
public class Multithreading_threadClass {
    public static void main(String args[])
    {
       int n=10;
       
      for(int i=0;i<n;i++)
      {
           MultithreadingDemo obj=new MultithreadingDemo();
        obj.start();
      }
        
    }
}
