/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Instance_variables {
    public String name; //instance variable
    
    public void Employee(String emp_name)
    {
        name=emp_name;
    }
    
    public void print_emp()
    {
        System.out.println("Employee Name is "+name);
    }
    public static void main(String args[])
    {
        Instance_variables iv=new Instance_variables();
        iv.Employee("Raj");
        iv.print_emp();
    }
}
