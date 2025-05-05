/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaabstractclass.abstractmethod;

abstract class Parent {

    public Parent() {
        System.out.println("Iam constructor of parent");
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    abstract public void greet();
    abstract public void greet2();

}

class Child extends Parent {
    
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }

    @Override
    public void greet2() {
        System.out.println("Good Afternoon");
    }
}

abstract class Child3 extends Parent {

    public void th() {
        
    }

    @Override
    public void greet() {
        System.out.println("Good Morning");
    }

    @Override
    public void greet2() {
        System.out.println("Good Afternoon");
    }
}

public class JavaAbstractClassAbstractMethod {

    public static void main(String[] args) {
        
//        Parent p = new Parent(); Not allowed
        Child c = new Child();
//        Child3 c3 = new Child3(); --> error
    }

}
