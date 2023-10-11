/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atm;

/**
 *
 * @author REVA
 */
import java.util.Scanner;
public class ATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); int pilih;
        System.out.println("Selamat Datang di ATM");
        System.out.println("1. Penarikan Tunai");
        System.out.println("2. Transfer");
        System.out.println("3. Cek Saldo");
        System.out.print("Silahkan Pilih = ");
        pilih = s.nextInt();
        if(pilih==1){ System.out.println("Masukan Nominal: ");
        }else if (pilih==2){ System.out.println("Masukan No.Rek: ");
        }else if (pilih==3){ System.out.println("Saldo Anda: ");
        }else{ System.out.println("Maaf, Pilihan Tidak Ada");
        }
    }
}
