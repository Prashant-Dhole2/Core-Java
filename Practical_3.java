/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
import java.awt.*;
public class Practical_3 {
     public static void main(String args[])
    {
        Frame f=new Frame();
       MenuBar mb=new MenuBar();
        Menu F=new Menu("File");
        Menu E=new Menu("Edit");
        Menu V=new Menu("View");
        MenuItem N=new MenuItem("New");
        MenuItem O=new MenuItem("Open");
        F.add(N);
        F.add(O);
        
        mb.add(F);
        mb.add(E);
        mb.add(V);
        f.setMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
   
    
}
