/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.pkg1.pkgwhile;

/**
 *
 * @author REVA
 */
import java.util.Scanner;
public class Tugas1While {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println(" Program while ");
        System.out.print("Masukkan Angka = ");
        int i = s.nextInt();
        System.out.println("Deret Angka Ganjil : ");
        int angka = 1;
        while (i >= angka){
            System.out.println(angka+" ");
            angka += 2;
        }
        
    }
    
}
