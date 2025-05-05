/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javamultidimensionalarray;

/**
 *
 * @author jitendra
 */
public class JavaMultiDimensionalArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] flats; // A 2-D Array
        flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        for(int i=0; i<flats.length; i++){
            for(int j=0; j<flats[i].length; j++){
            System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");
        }
    }
    
}
