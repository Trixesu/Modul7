package com.mycompany.modulvii;

import java.util.Scanner;

public class DoWhile7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahMangga, beratMangga;
        int biasa = 0, bagus = 0, unggul = 0;
        
        System.out.print("Masukkan Jumlah Mangga \t: ");
        jumlahMangga = input.nextInt();
        
        int i = 1;
        while (i <= jumlahMangga) {
            do {
                System.out.print("Masukkan Berat Mangga ke-"+i+"\t: ");
                beratMangga = input.nextInt();
                if (beratMangga <= 0) {
                    System.out.println("Berat Mangga Anda Tidak Valid. Silakan Masukkan Berat Lebih Dari 0!");
                }
            } while (beratMangga <= 0);
            
            if (beratMangga < 500) {
                biasa++;
            } else if (beratMangga < 750) {
                bagus++;
            } else {
                unggul++;
            }
            i++;
        }
        System.out.println("======================================");
        System.out.println("Hasil Identifikasi Mangga");
        System.out.println("Mangga Berkualitas Biasa\t: "+biasa+" buah");
        System.out.println("Mangga Berkualitas Bagus\t: "+bagus+" buah");
        System.out.println("Mangga Berkualitas Unggul\t: "+unggul+" buah");
        input.close();
    }
}