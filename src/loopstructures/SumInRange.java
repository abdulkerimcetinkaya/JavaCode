package loopstructures;

/**
 * Görev: Kullanıcıdan başlangıç ve bitiş değerleri al ve bu aralıktaki tüm sayıların toplamını hesapla.
 */

import java.util.Scanner;

public class SumInRange {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("bir başlangıç değeri giriniz: ");
        int baslangic = scan.nextInt();

        System.out.print("bir bitis değeri giriniz: ");
        int bitis = scan.nextInt();

        int toplam = 0;
        for (int i = baslangic; i <= bitis; i++){
            toplam += i;
        }
        System.out.println("Toplam: " + toplam);
        scan.close();
    }
}
