/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodoverringinjava;

/**
 *
 * @author jitendra
 */

class A{
    public int a;
    public int aman(){
        return 4;
    }
    
    public void meth2(){
        System.out.println("Iam method 2 of class A");
    }
}

class B extends A{
    
    @Override
    public void meth2(){
        System.out.println("Iam method 2 of class B");
    }
    
     public void meth3(){
        System.out.println("Iam method 3 of class B");
    }
}

public class MethodOverringInJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A a = new A();
        a.meth2();
        B b = new B();
        b.meth2();
    }
    
}
