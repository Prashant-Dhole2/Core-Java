/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Array_multi {
    public static void main(String args[])
    {
        int arr[][]={{20,7,9},{3,6,1},{7,4,2}};
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println(arr[i][j]+" ");
            }
           System.out.println();
        }
    }
}
