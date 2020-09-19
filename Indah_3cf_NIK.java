/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2019;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class NIK {
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Masukkan NIK Anda ");
     String nik = sc.next();
     System.out.println("NIK: "+nik);
     System.out.println("Kode Bagian: "+nik.substring(0,3));
     System.out.println("Tahun Masuk: "+20+nik.substring(5,7));
     if (nik.substring(5,6).equals(01)){System.out.println("Status Karyawan: KONTRAK");}
     else {System.out.println("Status Karyawan: TETAP");}
     System.out.println("Nomor Pokok: "+nik.substring(7,10));
             }
     
    }