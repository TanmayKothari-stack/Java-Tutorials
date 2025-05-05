/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodsinjava;

/**
 *
 * @author jitendra
 */
public class MethodsInJava {

    /**
     * @param args the command line arguments
     */
     static int logic(int x, int y){
         int z;
         if(x>y){
             z = x+y;
         }
         else{
             z = (x+y)*5;
         }
         return z;
        }
     
    public static void main(String[] args) {
//        Method invalucation usin object creation
//        MethodsInJava obj = new MethodsInJava();
//        int c = obj.logic(5, 7);
//        System.out.println(c);

        int c = logic(5,7);
        System.out.println(c);

    }
    
}
