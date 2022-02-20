/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.*;
public class Main {

    public static void main(String[] args) {
        double C,F,R,K;
        int menu=0;
        Scanner sc= new Scanner(System.in);
        
        System.out.println("+---------------------------+");
        System.out.println("| PROGRAM KONVERSI SUHU AIR |");
        System.out.println("+---------------------------+");
        System.out.println("Input Data");
        System.out.println("----------");
        System.out.print("Suhu dalam celcius : ");
        C = sc.nextInt();
        System.out.print("\n");
        
        while (menu!=3){
            R = (4*C)/5;
            F = (9*C)/5 +32;
            K = C + 273.15;
            
            System.out.println("Opsi");
            System.out.println("----");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            System.out.print("Piih    : ");
            menu = sc.nextInt();
            System.out.print("\n");
            switch (menu){
                case 1:
                    System.out.println("Suhu dalam Celcius : " + C + "°C");
                    System.out.println("Dalam Fahrenheit : " + F + "°F");
                    System.out.println("Dalam Reamur : " + R + "°R");
                    System.out.println("Dalam Kelvin : " + K + "K");
                    if (C<0){
                        System.out.println("Kondisi Air Beku");
                    } else if (C>100){
                        System.out.println("Kondisi Air Mendidih");
                    } else if (C>=0 || C<=100){
                        System.out.println("Kondisi Air Normal");
                    }
                    break;
                case 2:
                    System.out.println("Input Data");
                    System.out.println("----------");
                    System.out.println("Suhu dalam celcius : ");
                    C = sc.nextInt();
                    System.out.print("\n");
                    break;
                case 3:
                    break;
                default :
                    System.out.println("Opsi tidak ada, mohon masukkan opsi dengan benar");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
