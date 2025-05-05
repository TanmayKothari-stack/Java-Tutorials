/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javainterfaceexample.defaultmethods;

interface MyCamera{
    void takeSnap();
    void recordVideo();
   
}

interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phonenumber){
        System.out.println("Calling "+ phonenumber);
    }
    void pickCall(int phonenumber){
        System.out.println("Connecting... ");
    }
//    void takeSnap(){
//        System.out.println("Taking Snap");
//    }
}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
     @Override
     public void takeSnap(){
        System.out.println("Taking Snap");
    }

    @Override
    public String[] getNetworks() {
        System.out.println("Getting List of Networks");
        String[] networkList = {"Aman","Rohit","Ajay"};
        return networkList;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to "+ network);
    }

    @Override
    public void recordVideo() {
        
    }
}

public class JavaInterfaceExampleDefaultMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MySmartPhone ms = new MySmartPhone();
        String[] ar = ms.getNetworks();
        for(String item: ar){
             System.out.println(item);
        }
    }
    
}
