/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
import javax.swing.*;
public class NewClass  {
    public static void main(String args[])
    {
        JFrame f=new JFrame("JRadioButton Example");
        
        JRadioButton rb1=new JRadioButton("Marathi");
        
        rb1.setBounds(50,50,100,30);
        JRadioButton rb2=new JRadioButton("Hindi");
        rb2.setBounds(50,100,100,30);
        JRadioButton rb3=new JRadioButton("English");
        rb3.setBounds(50,150,100,30);
        
        ButtonGroup bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        
     //   f.add(bg);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        
    }
}
