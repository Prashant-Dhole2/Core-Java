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
public class Switch_week {
    public static void main(String args[])
    {
        int a;
        Scanner dd=new Scanner(System.in);
        System.out.println("Enter  a day");
        a=dd.nextInt();
        switch(a)
        {
            case 1:
               System.out.println("Monday"); 
               break;
            case 2:
               System.out.println("Tuesday");
               break;
            case 3:
               System.out.println("Wednesday");
               break;
            case 4:
               System.out.println("Thursday");
               break;
            case 5:
               System.out.println("Frieday");
               break;
            case 6:
               System.out.println("Saturday");
               break;
            case 7:
               System.out.println("Sunday");
               break;
            default :
               System.out.println("Invalid day");
        }
    }
}
