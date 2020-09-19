/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2019;
import java.util.Scanner;
public class Indah_3cf_suhu {
public static void main (String[] args) {
            int suhu;
            Scanner userInput = new Scanner(System.in);
            System.out.print("Masukkan suhu suatu benda (Celcius) : ");
            
            suhu= userInput.nextInt();
            if (suhu < 0){
                System.out.println("Adalah Zat Padat ");}
            else if (suhu <= 100){
                System.out.println("Adalah Ialah Zat Cair ");}
            else if (suhu > 100){
                System.out.println("Adalah Ialah Zat Gas ");
            
            }
        }    
}
