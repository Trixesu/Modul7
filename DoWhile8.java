package com.mycompany.modulvii;

import java.util.Scanner;

public class DoWhile8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;
        double kuadrat = 0;

        System.out.print("Masukkan banyak data yang diolah : ");
        int banyakData = input.nextInt();

        System.out.print("Masukkan data ke-1 : ");
        int data1 = input.nextInt();
        int max = data1, min = data1;
        total += data1;
        kuadrat += Math.pow(data1, 2);

        int dataN = 2;
            do {
                System.out.print("Masukkan data ke-" +dataN+ " : ");
                int nilaiData = input.nextInt();

                if (nilaiData > max) {
                    max = nilaiData;
                }
                if (nilaiData < min) {
                    min = nilaiData;
                }
                total += nilaiData;
                kuadrat += Math.pow(nilaiData, 2);
                dataN++;
            } while (dataN <= banyakData);

        double ratarata = total / banyakData;
        double rentangData = max - min;
        double variansi = (kuadrat - banyakData * Math.pow(ratarata, 2)) / banyakData;
        double deviasiStd = Math.sqrt(variansi);

        System.out.println("Rata-rata\t: " +ratarata);
        System.out.println("Data terbesar\t: " +max);
        System.out.println("Data terkecil\t: " +min);
        System.out.println("Rentang data\t: " +rentangData);
        System.out.println("Variansi\t: " +variansi);
        System.out.println("Deviasi Standard : " +deviasiStd);
        input.close();
    }
}
