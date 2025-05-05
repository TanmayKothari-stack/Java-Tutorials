/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaarrays;

/**
 *
 * @author jitendra
 */
public class JavaArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Classroom of 500 students - You have to store marks of these 500 students
           you have 2 options
            1. create 500 variables
            2. use Arrays (recommended)
        */
        /* There are 3 methods to create an array in Java
        1. Delaceration and memory location
        int[] marks = [5];
        
        2. Declaration and then memory location
        int[] marks;
        marks = new int[5];
        
        Initialization
        
        marks[0] = 100;
        marks[1] = 60;
        marks[2] = 70;
        marks[3] = 90;
        marks[4] = 86;
        System.out.println(marks[4]);
        */
        
        //3. Decalation Memory Allocation and Initialization together
        int[] marks = {98,45,79,99,80};
        System.out.println(marks[4]);
         
    }
    
}
