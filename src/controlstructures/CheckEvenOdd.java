package controlstructures;

import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scan.nextInt();


        if (sayi % 2 == 0) {
            System.out.println("Girilen sayı çifttir: " + sayi);
        } else {
            System.out.println("Girilen sayı tektir: " + sayi);
        }

        scan.close();
    }
}
