/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class ABC {
    public static void main(String []args){
String num = "";
for(int i = 5; i>=1; i--){
num += i;
//System.out.print(i);
for(int j = 1; j<=i; j++){  
System.out.print(i);
}
if(i != 1){
System.out.print("\n"+num);
}
}
  
    }}