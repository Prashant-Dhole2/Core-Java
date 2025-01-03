/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
 public class Parameterize_constr {
    int id;
    String name;
    Parameterize_constr(int j,String n)
    {
        id=j;
        name=n;
    }
    void display()
    {
        System.out.println(id+" "+name);
    }
    public static void main(String args[])
    {
        Parameterize_constr p1=new Parameterize_constr(10,"Suraj");
        Parameterize_constr p2=new Parameterize_constr(20,"Raj");
        
        p1.display();
        p2.display();
        
     }
}
