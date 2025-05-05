/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaswitchcase;
import java.util.Scanner;

/**
 *
 * @author jitendra
 */
public class JavaSwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int age = 56;
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        
        switch(age)
        {
            case 18:
                System.out.println("You are going to become an Adult");
                break;
            case 23:
                System.out.println("You are going to join a job");
                break;
            case 60:
                System.out.println("You are going to retire");
                break;
            default:
                System.out.println("Enjoy your life");
        }
        System.out.println("Thanks for using my Java Code!");
                
//        if(age>56)
//        {
//            System.out.println("You are experinced");
//        }
//        else if(age>46)
//        {
//            System.out.println("You are semi experinced");
//        }
//        else if(age>36)
//        {
//            System.out.println("You are semi-semi experinced");
//        }
//        else
//        {
//            System.out.println("You are not experinced");
//        }
    }
    
}
