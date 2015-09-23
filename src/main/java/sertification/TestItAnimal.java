/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sertification;
/** @author Oleksii_Prokopenko */
class Animal {
    protected int a = 1;

    public int getA() {
        return a;
    }
}

class Animal2 extends Animal {
    {
        a = 2;
    }
}

class Animal3 extends Animal {
    protected int a = 3;
}

public class TestItAnimal {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal2();
        Animal a3 = new Animal3();
        System.out.println("a1.getA() = " + a1.getA());    //  
        System.out.println("a2.getA() = " + a2.getA());   //   
        System.out.println("a3.getA() = " + a3.getA());   //   

    }
}
