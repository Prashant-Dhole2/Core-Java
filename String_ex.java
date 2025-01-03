/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class String_ex {
    public static void main(String args[])
    {
        String title="Hello world ";
        String siteName="www.glitchbusters.co.in";
        
        System.out.println("Lenght of title : "+title.length());
        System.out.println("Char ai Index 3 : "+title.charAt(3));
        System.out.println("Index of w : "+title.indexOf('w'));
        System.out.println("Empty : "+title.isEmpty());
        System.out.println("Equals : "+siteName.equals(title));
        System.out.println("Uppere case : "+siteName.toUpperCase());
        System.out.println("concatination : "+title.concat(siteName));
    }
}
