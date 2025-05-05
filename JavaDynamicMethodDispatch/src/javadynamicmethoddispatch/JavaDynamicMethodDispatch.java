/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javadynamicmethoddispatch;

class Phone {

    public void showtime() {
        System.out.println("Time is 8 am");
    }

    public void on() {
        System.out.println("Truning on phone..");
    }
}

class SmartPhone extends Phone {

    public void music() {
        System.out.println("Playing music");
    }

    @Override
    public void on() {
        System.out.println("Truning on smart phone..");
    }

}

public class JavaDynamicMethodDispatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Phone obj = new Phone(); // Allowed
//        SmartPhone smobj = new SmartPhone(); // Allowed
//        obj.name();
        Phone obj = new SmartPhone(); //Yes it is allowed
//        SmartPhone obj = new Phone(); Not allowed
        obj.showtime();
        obj.on();
//        obj.music() Not allowed

    }

}
