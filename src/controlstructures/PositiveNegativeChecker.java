package controlstructures;

import java.util.Scanner;

public class PositiveNegativeChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scan.nextInt();

        if (sayi > 0) {
            System.out.println("Girilen sayı pozitiftir.");
        } else if (sayi < 0) {
            System.out.println("Girilen sayı negatiftir.");
        } else {
            System.out.println("Girilen sayı 0'a eşittir.");
        }

        scan.close();
    }
}
