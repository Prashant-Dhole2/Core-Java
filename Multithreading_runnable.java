/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
class Multithreading implements Runnable
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
public class Multithreading_runnable {
    public static void main(String args[])
    {
        int n=8;
        for(int i=0;i<n;i++)
        {
            Thread obj=new Thread(new Multithreading());
            obj.start();
        }
    }
}