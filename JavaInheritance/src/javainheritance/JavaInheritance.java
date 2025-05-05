/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javainheritance;

class Base {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("Iam in base setting text X now");
        this.x = x;
    }
    
    public void printMe(){
        System.out.println("Iam an a constructor");
    }
}

class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y){
        System.out.println("Iam in base setting text Y now");
        this.y = y;
    }
    
}

public class JavaInheritance {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // Creating an object of base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());
        
        // Creating an object of derived class
        Derived d = new Derived();
        d.setY(43);
        System.out.println(d.getY());
    }

}
