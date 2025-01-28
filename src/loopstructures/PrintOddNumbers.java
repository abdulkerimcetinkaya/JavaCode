package loopstructures;
/**
 * Görev: Kullanıcıdan bir başlangıç ve bitiş değeri al ve bu aralıktaki tek sayıları yazdır.
 */

import java.util.Scanner;

public class PrintOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Başlangıç değerini giriniz: ");
        int baslangic = scan.nextInt();

        System.out.print("Bitiş değerini giriniz: ");
        int bitis = scan.nextInt();


        if (baslangic > bitis) {
            System.out.println("Başlangıç değeri bitiş değerinden büyük olamaz!");
        } else {
            System.out.println("Tek sayılar (" + baslangic + " ile " + bitis + " arasında):");
            for (int i = baslangic; i <= bitis; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }

        scan.close(); // Scanner nesnesini kapatma
    }
}
