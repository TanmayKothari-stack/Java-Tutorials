/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javavariablesarguements;

/**
 *
 * @author jitendra
 */
public class JavaVariablesArguements {

    /**
     * @param args the command line arguments
     */
//    static int sum(int a, int b){
//        return a+b;
//    }
//    static int sum(int a, int b, int c){
//        return a+b+c;
//    }
    static int sum(int x, int ...arr){
        // Available as int[] arr;
        int result = x;
        for(int a : arr){
            result +=a;
        }
        return result;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Welcome to var args tutorial");
        System.out.println("The sum of 4 and 5 is: "+sum(4,5));
        System.out.println("The sum of 4, 3 and 5 is: "+sum(4, 3, 5));        
    }
    
}
