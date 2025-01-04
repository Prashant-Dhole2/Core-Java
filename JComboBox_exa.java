 

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
public class JComboBox_exa {
    JComboBox_exa()
     {
     JFrame f=new JFrame("ComboBox ");
        JLabel lb=new JLabel("country");
        JComboBox jb=new JComboBox();
        jb.addItem("India");
        jb.addItem("UK");
        jb.addItem("USA");
        jb.addItem("US");
     lb.setBounds(50,100,100,20);
     jb.setBounds(50,150,100,20);
     f.add(jb);
    f.add(lb);
     f.setLayout(null);
     f.setSize(400,400);
     f.setVisible(true);
 }public static void main(String args[])
 {
     JComboBox_exa p=new JComboBox_exa();
 }
}
