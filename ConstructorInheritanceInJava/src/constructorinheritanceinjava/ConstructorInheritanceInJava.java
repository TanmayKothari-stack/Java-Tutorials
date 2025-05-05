/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructorinheritanceinjava;

class Base{
    Base(){
        System.out.println("Iam a construttor");
    }
    Base(int a){
        System.out.println("Iam a overloaded construttor with value of a as: " + a);
    }
}

class Derived extends Base{
    Derived(){
        //super(0);
        System.out.println("Iam a derived class constructor");
    }
    
    Derived(int x, int y){
        super(x);
        System.out.println("Iam a overloaded construttor of Derived with value of a as: " + x + " " + y);
    }
   
}

public class ConstructorInheritanceInJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Base b = new Base();
        //Derived d = new Derived();        
        Derived d = new Derived(14,9);

    }
    
}
