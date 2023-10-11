/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string.array;

/**
 *
 * @author REVA
 */
public class StringArray {
    public static void main(String[] args) {
        
        String[] buah = new String[4];
        
        buah[0] = "Jambu";
        buah[1] = "Apel";
        buah[2] = "Pisang";
        buah[3] = "Anggur";
        
        int[] npm = {101,102,103,104};
        for(int i=0; i<4; i++){
            System.out.println("Value buah ke "+(i+1)+" "+buah[i]);
        }
        for(int i=0; i<4; i++){
        System.out.println("NPM: "+npm[i]);
    }  
  }
}
