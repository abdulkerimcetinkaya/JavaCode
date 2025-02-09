package loopstructures;

import java.util.Scanner;

public class DigitSumCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scan.nextInt();
        int toplam = 0;

        while (sayi != 0) {
            toplam += sayi % 10;
            sayi /= 10;
        }

        System.out.println("Basamakların toplamı: " + toplam);

        scan.close();
    }
}
