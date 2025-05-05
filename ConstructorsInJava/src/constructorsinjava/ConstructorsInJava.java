package constructorsinjava;

class MyEmployee {

    private int id;
    private String name;
    
    public MyEmployee(){
        id = 45;
        name = "Your name here";
    }
    public MyEmployee(String myname, int myid){
        id = myid;
        name = myname;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        this.id = i;
    }
}

public class ConstructorsInJava {

    public static void main(String[] args) {
        // TODO code application logic here
        //MyEmployee aman = new MyEmployee("Hey Aman",45);
        MyEmployee aman = new MyEmployee();        
        //aman.setName("Hey Aman");
        //aman.setId(125);
        System.out.println(aman.getId());
        System.out.println(aman.getName());  
    }

}
