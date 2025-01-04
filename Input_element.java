/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
import java.util.*;

public class Input_element {

    public static void main(String[] args) {
        int a, b, c;
        String st;
        float f;
        boolean bl;
        char g;

        Scanner s = new Scanner(System.in);
        System.out.println("enter Fist value : ");
        a = s.nextInt();
        System.out.println("enter second value ");
        b = s.nextInt();
        c = a + b;
        System.out.println("Addition is " + c);
        System.out.println("Enter Name : ");
        st = s.next();
        System.out.println("Name is " + st);
        System.out.println("enter Float value : ");
        f = s.nextFloat();
        System.out.println("Float value ia : " + f);
        System.out.println("enter Boolean : ");
        bl = s.nextBoolean();
        System.out.println("Boolean value is : " + bl);
        System.out.println("enter Char : ");
        g = s.next().charAt(5);
        System.out.println("characte is  : " + g);
    }
}
