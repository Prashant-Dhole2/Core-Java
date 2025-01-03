/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Array_example {
    public static void main(String args[])
    {
        int []arr;
        arr=new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Element at index "+ i +" : "+arr[i]);
        }
    }
}
