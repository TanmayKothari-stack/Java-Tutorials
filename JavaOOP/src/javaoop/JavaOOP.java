/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaoop;

/**
 *
 * @author jitendra
 */

class Employee{
    int id;
    String name;
    int sallery;
    public void printDetails(){
        System.out.println("My name is: "+ id);
        System.out.println("My name is: "+ name);        
    }
    public int getSallery(){
        return sallery;
    }
}

public class JavaOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("This is our custom class");
        Employee aman = new Employee();
        Employee jhon = new Employee(); // Instatiating a new Employee Object        // Instatiating a new Employee Object
        // Settings Attributes
        aman.id = 12;
        aman.name = "Hey Aman";
        aman.sallery = 34000;
        jhon.id = 36;
        jhon.name = "Hey Jhon";
        jhon.sallery = 12000;
        // Printing the Attributes
        aman.printDetails();
        jhon.printDetails();
        int sallery = jhon.getSallery();
        System.out.println(sallery);
        //System.out.println(aman.id);
        //System.out.println(aman.name);
    }
    
}
