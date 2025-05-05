/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabreak.pkgcontinue;

/**
 *
 * @author jitendra
 */
public class JavaBreakContinue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        for(int i = 0; i<50; i++)
//        {
//            System.out.println(i);
//            System.out.println("Java is great");
//            if(i==2)
//            {
//                System.out.println("Ending the loop");
//                break;
//            }
//        }
//        int i = 0;
//        while(i<5){
//            System.out.println(i);
//            System.out.println("Java is great");
//            if(i==2){
//                System.out.println("Ending the loop");
//                break;
//            }
//            i++;
//        }
//        System.out.println("Loop ends here");

        for(int i = 0; i<5; i++)
        {
            System.out.println(i);
            System.out.println("Java is great");
            if(i==2)
            {
                System.out.println("Ending the loop");
                continue;
            }
        }
    }
    
}
