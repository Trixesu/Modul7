package com.mycompany.modulvii;

import java.util.Scanner;

public class DoWhile5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        
            do {
                System.out.print("Masukkan nilai a : ");
                a = input.nextDouble();
                    if (a == 0) {
                    System.out.println("a bernilai "+(int)a+". Masukkan kembali angka selain "+(int)a+"!");
                    }
            } while (a == 0);
                System.out.print("Masukkan nilai b : ");
                b = input.nextDouble();
                System.out.print("Masukkan nilai c : ");
                c = input.nextDouble();
                
            double diskriminan = Math.pow(b, 2) - 4 * a * c;
            System.out.println("Diskriminan = "+diskriminan);
            
            if (diskriminan > 0) {
                double akar1 =  (-b + Math.sqrt(diskriminan))/(2 * a);
                double akar2 =  (-b - Math.sqrt(diskriminan))/(2 * a);
                System.out.println("Jenis akar : riil dan berbeda");
                System.out.println("Akar 1 : "+akar1);
                System.out.println("Akar 2 : "+akar2);
            } else if (diskriminan == 0) {
                double akar = -b/(2 * a);
                System.out.println("Jenis akar : rill dan sama");
                System.out.println("Akar : "+akar);
            } else {
                double realPart = -b/(2 * a);
                double imaginerPart = Math.sqrt(-diskriminan)/(2 * a);
                System.out.println("Jenis akar : kompleks");
                System.out.println("Akar 1 "+realPart+" + "+imaginerPart+"i");
                System.out.println("Akar 2 "+realPart+" - "+imaginerPart+"i");
            }
        input.close();
    }
}
