/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaacessmodifiers.getters.setters;

/**
 *
 * @author jitendra
 */
class MyEmployee{
    private int id;
    private String name;
    
    public String getName(){
        return name;
    }
    
    public void setName(String n){
        this.name = n;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int i){
        this.id = i;
    }
}

public class JavaAcessModifiersGettersSetters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyEmployee aman = new MyEmployee();
        // aman.name = "Hey aman" -> Throws error due to private access modifier
        aman.setName("Hey Aman");
        aman.setId(45);
        System.out.println(aman.getName());
        System.out.println(aman.getId());        
        
    }
    
}
