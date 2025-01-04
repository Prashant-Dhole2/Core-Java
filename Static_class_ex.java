/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Static_class_ex {
    public static String str="GBTECH";
    public static class Test
    {
        public void show()
        {
            System.out.println(str);
        }
    }
    public static void main(String args[])
    {
        Static_class_ex.Test obj=new Static_class_ex.Test();
        obj.show();
    }
}
