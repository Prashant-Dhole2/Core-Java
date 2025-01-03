/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Stud {
    int id;
    String name;
    
    void display()
    {
        System.out.println(id+" "+name);
    }
    public static void main(String args[])
    {
        Stud s1=new Stud();
        Stud s2=new Stud();
        s1.display();
        s2.display();
        
    }
}
