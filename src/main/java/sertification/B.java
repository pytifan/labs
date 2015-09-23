/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sertification;

/* @author Oleksii_Prokopenko */
class A {
    A() {
        print();
    }

    void print() {
        System.out.println("A");
    }
}

class B extends A {

    int i = 4;
    public static void main(String[] args) {
        A a = new B();
        a.print();
    }

    void print() {
        System.out.println(i);
    }
}
