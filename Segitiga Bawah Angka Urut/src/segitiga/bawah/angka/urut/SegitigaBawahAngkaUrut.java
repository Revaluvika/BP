/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package segitiga.bawah.angka.urut;

/**
 *
 * @author REVA
 */
import java.util.Scanner;
public class SegitigaBawahAngkaUrut {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Program Segitiga Bawah");
        System.out.print("Masukkan i = ");
        int i, j, segitiga_bawah = s.nextInt();
        System.out.println(" ");
        for(i = 1; i <= segitiga_bawah; i++){
            for(j = 1; j <= i; j++){
            System.out.print(j+" ");
        }
        System.out.println("");
     }       
    }
}

    
    
