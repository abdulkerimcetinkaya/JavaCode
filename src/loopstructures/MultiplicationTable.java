package loopstructures;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Bir sayı giriniz: ");
        int sayi = scan.nextInt();


        System.out.print("Çarpım tablosunun en büyük çarpanı: ");
        int aralik = scan.nextInt();


        for (int i = 1; i <= aralik; i++) {
            System.out.println(sayi + " x " + i + " = " + (sayi * i));
        }

        scan.close();
    }
}
