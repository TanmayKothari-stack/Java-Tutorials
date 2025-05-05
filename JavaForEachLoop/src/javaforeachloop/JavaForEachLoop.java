/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaforeachloop;

/**
 *
 * @author jitendra
 */
public class JavaForEachLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* TODO code application logic here
        String[] students = {"ABC","PQR","XYZ"};
        float[] marks = {98.5f,45.5f,79.5f,99.5f,88.5f};
        */
        
        int[] marks = {98,45,79,99,88};
        //System.out.println(marks.length);
        // Displaying the Array (Naive way)
//        System.out.println(marks[0]);
//        for(int i=0; i<marks.length; i++){
//            System.out.println(marks[i]);
//        }
//      Displaying the array in reverse order
//        for(int i = marks.length-1; i>=0; i--){
//            System.out.println(marks[i]);
//        }
//      Printing array using foreach loop
        for(int element: marks){
            System.out.println(element);
        }
    }
    
}
