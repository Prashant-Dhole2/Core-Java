/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Fab_series_ex {
    public static void main(String args[])
    {
        int a=10;
        int frist=0,second=1;
        for(int i=0;i<=a;i++)
        {
           System.out.println(frist +", ");
           int next=frist+second;
           frist=second;
           second=next;
           
        }
        
    }
}
