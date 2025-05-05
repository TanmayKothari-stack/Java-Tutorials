/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgthis.superkeywordinjava;

/**
 *
 * @author jitendra
 */
class EkClass {

    int a;

    EkClass(int v) {
        this.a = v;
    }

    public int getA() {
        return a;
    }

    public int returnone() {
        return 1;
    }
}

class DoClass extends EkClass {

    DoClass(int c) {
        super(c);
        System.out.println("Iam a constructor");
    }
}

public class ThisSuperKeywordInJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EkClass e = new EkClass(65);
        DoClass d = new DoClass(65);

        System.out.println(e.getA());
    }

}
