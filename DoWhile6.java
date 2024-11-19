package com.mycompany.modulvii;

import java.util.Scanner;

public class DoWhile6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double uts1, uts2, uas;
        
            do {
                System.out.print("Masukkan Nilai Ujian Tengah Semester (1)\t: ");
                uts1 = input.nextDouble();
                if (uts1 < 0 || uts1 > 100) {
                    System.out.println("Nilai yang diijinkan adalah 0 sampai 100. Masukkan kembali nilai anda!");
                }
            } while (uts1 < 0 || uts1 > 100);

            do {
                System.out.print("Masukkan Nilai Ujian Tengah Semester (2)\t: ");
                uts2 = input.nextDouble();
                if (uts2 < 0 || uts1 > 100) {
                    System.out.println("Nilai yang diijinkan adalah 0 sampai 100. Masukkan kembali nilai anda!");
                }
            } while (uts2 < 0 || uts2 > 100);

            do {
                System.out.print("Masukkan Nilai Ujian Akhir Semester\t\t: ");
                uas = input.nextDouble();
                if (uas < 0 || uas > 100) {
                    System.out.println("Nilai yang diijinkan adalah 0 sampai 100. Masukkan kembali nilai anda!");
                }
            } while (uas < 0 || uas > 100);
        
        double nilaiTotal;
        char grade;
        nilaiTotal = (0.3 * uts1) + (0.3 * uts2) + (0.49 * uas);
        
            if (nilaiTotal >= 80) {
                grade = 'A';
            } else if (65 <= nilaiTotal || nilaiTotal >= 80) {
                grade = 'B';
            } else if (55 <= nilaiTotal || nilaiTotal >= 65) {
                grade = 'C';
            } else if (50 <= nilaiTotal || nilaiTotal >= 55) {
                grade = 'D';
            } else {
                grade = 'E';
            }
        System.out.println("Nilai Final\t: "+(int)nilaiTotal);
        System.out.println("Kriteria Nilai : "+grade);
        input.close();
    }
}