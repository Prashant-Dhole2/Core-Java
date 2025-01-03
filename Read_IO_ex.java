/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
import java.io.*;
public class Read_IO_ex {
    public static void main(String args[])
    {
        BufferedReader br =null;
        BufferedReader br2=null;
        
        try{
            br=new BufferedReader(new FileReader("text.txt"));
            String contentLine=br.readLine();
            while(contentLine !=null)
            {
                System.out.println(contentLine);
                contentLine=br.readLine();
            }
            }catch(IOException e)
                
                    {
                     System.out.println(e);
                    }
        }
        
    }

