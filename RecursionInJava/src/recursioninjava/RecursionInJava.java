/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursioninjava;

/**
 *
 * @author jitendra
 */
public class RecursionInJava {

    /**
     * @param args the command line arguments
     */
     // factorial(n) = n * n-1 *...1
       //factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
    static int factorial(int n){
       if(n==0 || n==1){
           return 1;
       }
       else{
           return n*factorial(n-1);
       }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 5;
        System.out.println("The value of factorial n is: "+factorial(n));
    }
    
}
