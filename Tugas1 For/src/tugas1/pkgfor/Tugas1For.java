/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1.pkgfor;

/**
 *
 * @author REVA
 */
import java.util.Scanner;
public class Tugas1For {
    public static void main(String[] args) {
       Scanner s = new Scanner (System.in);
        System.out.println("Program For");
        System.out.print("Masukkan Angka : ");
        int j = s.nextInt();
        System.out.println("Deret angka Ganjil :");
        int angka = 1;
        for (int i = 1; i <= j; i += 2){
            System.out.println(i + " ");
        }
    }
    
}
