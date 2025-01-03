/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
class ABC
{
    public int sum(int a,int b)
    {
        return a+b;
    }
}
public class Non_static_example {
    public static void main(String args[])
    {
        int x=5,y=10;
        ABC obj=new ABC();
        int s;
        s=obj.sum(x,y);
        
        System.out.println("sum is "+s);
    }
}
