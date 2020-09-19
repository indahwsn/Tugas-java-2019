/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2019;
import java.util.Scanner;
public class Indah_3cf_GanjilGenap {
 public static void main (String[] args) {
        int angka;
       Scanner userInput = new Scanner(System.in);    
         System.out.print("Masukkan Angka : ");
            angka= userInput.nextInt();
    
         if (angka %2 == 1){
            System.out.println("adalah angka GANJIL");}
         else 
            {System.out.println("adalah angka GENAP");}
        }    
}
