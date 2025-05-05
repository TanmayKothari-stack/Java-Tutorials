/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package associavityofoperators;

/**
 *
 * @author jitendra
 */
public class AssociavityOfOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        // Precedence & Associavity
           int a = 6*5-34/2;
           // Highest precedence goes * and /. They are then evaluated 
           // on th basis of left to right associavity
           
           // = 30-34/2
           // =30-17
           // =13
           
           int b = 60/5-34*2;        
           System.out.println(b);
           
    }
    
}
