/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Array_Max_value {
    public static void main(String args[])
    {
        int a[]={120,250,102,652,200,};
        int max=0;
        for(int i=0;i<=4;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
        System.out.println("Largest value is : "+max);
    }
}
