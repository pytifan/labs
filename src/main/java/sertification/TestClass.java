/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sertification;

class TestClass{
   public static void main(String args[]){
      boolean b = false;
      int i = 1;
      do{
          System.out.println("before " + i );
         i++ ;
         System.out.println("after " + i );
         System.out.println( b );
      } while (b = !b);
      System.out.println( "Out: " + b );
      System.out.println( "Out: " + i );
   }
}
