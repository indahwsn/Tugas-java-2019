/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2019;
import java.util.Scanner;

public class Indah_3cf_AnakAyam {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka:");
        int bil= sc.nextInt();
System.out.println("Anak Ayam turun " + bil);
for(int i = 0;i<bil;i++){
System.out.println("Hilang satu Tinggal " + (bil-1));
bil=bil-1;
    }
    }
}
