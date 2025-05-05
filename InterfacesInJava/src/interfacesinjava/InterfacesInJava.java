/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfacesinjava;


interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    void blowHornK3g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle, HornBicycle{
    void blowHorn(){
        System.out.println("Pee Poo");
    }

    @Override
    public void applyBrake(int decrement) {
        System.out.println("Applying Brake");
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("Appling Speed Up");
    }

    @Override
    public void blowHornK3g() {
        System.out.println("This is K3g pee pee pee");
    }

    @Override
    public void blowHornmhn() {
        System.out.println("Iam here po po po");
    }
    
}

public class InterfacesInJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AvonCycle cycle = new AvonCycle();
        cycle.applyBrake(1);
        // You can create properties in Interfaces
        //System.out.println(cycle.a);
        // You cannot modify the properties in Interfaces as they are final
//        cycle.a = 10;
        cycle.blowHornK3g();
        cycle.blowHornmhn();
    }
    
}
