/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javamethodoverloading;

/**
 *
 * @author jitendra
 */
public class JavaMethodOverloading {

    /**
     * @param args the command line arguments
     */
//    static void tellJoke(){
//        System.out.println("I invented a new word Plagarisim!");
//    }
//    static void change(int a){
//        a = 98;
//    }
//    static void change2(int[] arr){
//        arr[0] = 98;
//    }
        
    static void foo(){
        System.out.println("Good Morning bro!");
    }
    static void foo(int a){
        System.out.println("Good Morning " + a + " bro!");
    }
    static void foo(int a, int b){
        System.out.println("Good Morning " + a + " bro!");
        System.out.println("Good Morning " + b + " bro!");
        
    }
    static void foo(int a, int b, int c){
        System.out.println("Good Morning " + a + " bro!");
        System.out.println("Good Morning " + b + " bro!");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        //tellJoke();
        
        // Changing the integer
        //int x = 45;
        //change(x);
//        System.out.println("The value of X after running change is " + x);

        // Changing the array
//        int[] marks = {52, 73, 77, 89, 98, 94};
//        change2(marks);
//        System.out.println("The value of X after running change is " + marks[0]);

//        Method Overloading
        
        foo();
        foo(3000);
        foo(100,200);
        // Arguements are actual!
    }
    
}
