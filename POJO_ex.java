/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
class PojoDemo
{
    private double price=7884.34;
    public double getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price=price;
    }
}
public class POJO_ex {
    public static void main(String args[])
    {
         PojoDemo ob=new PojoDemo();
         ob.setPrice(555);
         System.out.println("This price product is "+ob.getPrice()+"Rs ");
    }
    
}
