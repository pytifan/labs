/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.algorithms;

/**
 *
 * @author Oleksii_Prokopenko
 */
public class Bridge {
    public static void main(String[] args) {
        System.out.println("1 yes/no? " + buildBridge(1, 2, 15));
        System.out.println("2 yes/no? " + buildBridge(5, 2, 15));
        System.out.println("3 yes/no? " + buildBridge(8, 3, 22));
        
        String s = new String("Harry");
        String s1 = "Harry";
        
//        s += "java";
        System.out.println(s == s1);
    }
   public static boolean buildBridge(int smallBoardsCount,int largeBoardsCount,int length){
       
       return largeBoardsCount * 5 + smallBoardsCount >= length;
               
//       int largeSize = 5;
//       int neededLarge = length/largeSize;
//       System.out.println("neededLarge: " + neededLarge);
//       
//       int neededOfSmall = length % largeSize;
//        System.out.println("neededOfSmall: " + neededOfSmall);
//        
//       if (neededLarge > largeBoardsCount) {
//           neededOfSmall += (neededLarge - largeBoardsCount) * largeSize;
//           System.out.println("in if neededOfSmall: " + neededOfSmall);
//       }
//            
//       return neededOfSmall <= smallBoardsCount;
   }
}
