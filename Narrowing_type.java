/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Narrowing_type {
 public static void main(String args[]) 
 { double z=16.77;
  long t=(long)z;
  int p=(int)t;
 
  System.out.println("befor coneversion"+z);
  System.out.println("after long coversion "+t);
  System.out.println("after int conversion "+p);
 }
 }
