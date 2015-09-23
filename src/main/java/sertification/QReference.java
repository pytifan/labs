/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sertification;

import java.util.Arrays;

class Base {

    String var = "EJava";

    void printVar() {
        System.out.println(var);
    }
}

class Derived extends Base {

    String var = "Guru";

    void printVar() {
        System.out.println(var);
    }
}

class QReference {

    public static void main(String[] args) {
        Base base = new Base();
        Base derived = new Derived();
        System.out.println(base.var);
        System.out.println(derived.var);
        base.printVar();
        derived.printVar();
        int[][] a = new int[2][];
        a[0] = new int[2];
        a[1] = new int[4];
        a[0][0] = 1;
        a[0][1] = 2;

        a[1][0] = 3;
        a[1][1] = 4;
        a[1][2] = 5;
        a[1][3] = 6;
        //System.out.println("a[" + 1 + "]" + "[" + 2 + "]: " + a[1][2]);
        for (int i = 0; i < 2; i++) {
            if (i == 1) {
                for (int j = 0; j < 4; j++) {
                    System.out.print("a[" + i + "]" + "[" + j + "]: " + a[i][j] + "  ");
                }
                System.out.println();
                break;
            }
            for (int j = 0; j < 2; j++) {
                System.out.print("a[" + i + "]" + "[" + j + "]: " + a[i][j] + "  ");
            }
            System.out.println();
        }
                    int ii = 0;
                    for (ii=1 ;  ii<5  ; ii++) continue;  //(1)
                    for (ii=0 ;       ; ii++) break;       //(2)
                    for (    ; ii<5?false:true ;    );     //(3)
                    System.out.println("i: " + ii);
    }
}
