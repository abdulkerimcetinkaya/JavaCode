package loopstructures;
/**
 * Görev: Kullanıcıdan bir sayı al ve bu sayının asal olup olmadığını kontrol et.
 */

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scan.nextInt();

        if (sayi < 2) {
            System.out.println("Asal sayı kontrolü için en küçük sayı 2'dir. Lütfen 2 veya daha büyük bir sayı giriniz.");
        } else {
            boolean isPrime = true;

            // Sayının kareköküne kadar bölenleri kontrol et
            for (int i = 2; i <= Math.sqrt(sayi); i++) {
                if (sayi % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(sayi + " asal bir sayıdır.");
            } else {
                System.out.println(sayi + " asal bir sayı değildir.");
            }
        }

        scan.close();
    }
}
