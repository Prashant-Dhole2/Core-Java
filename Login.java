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
public class Login {

    public static void main(String args[]) {
        Frame f = new Frame("Login Example");
        Label l1 = new Label("Login id :");
        Label l2 = new Label("Password :");
        TextField t1 = new TextField();
        TextField t2 = new TextField();
        Button b1 = new Button("Log In");
        
        
        l1.setBounds(60, 80, 60, 30);
        l2.setBounds(50, 120, 70, 30);
        t1.setBounds(120, 80, 120, 30);
        t2.setBounds(120, 120, 120, 30);
        b1.setBounds(130, 180, 80, 30);

        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(t2);
        f.add(b1);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
