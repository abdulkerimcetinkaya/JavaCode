package arrays;
/**
 * Görev:
 * Kullanıcıdan iki farklı dizi al.
 * Bu dizilerin elemanlarını birleştir ve yeni bir dizi oluştur.
 */

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMerger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 1. Dizi oluşturma.
        System.out.print("1. Dizinin boyutunu giriniz: ");
        int boyut1 = scan.nextInt();
        int[] dizi1 = new int[boyut1];
        // 2. Dizi oluşturma
        System.out.print("2. Dizinin boyutunu giriniz: ");
        int boyut2 = scan.nextInt();
        int[] dizi2 = new int[boyut2];

        // 1. Dizi elemanlarını belirleme
        for (int i = 0; i < boyut1; i++) {
            int index = i + 1;
            System.out.print("dizi1[" + index + "] = ");
            dizi1[i] = scan.nextInt();
        }
        // 2. Dizi elemanları belirleme
        for (int i = 0; i < boyut2; i++) {
            int index = i + 1;
            System.out.print("dizi2[" + index + "] = ");
            dizi2[i] = scan.nextInt();
        }

        // Birleştirilecek diziyi oluşturma
        int[] birlestirilmisDizi = new int[boyut1 + boyut2];

        for (int i = 0; i < birlestirilmisDizi.length; i++) {
            if (i < boyut1) {
                birlestirilmisDizi[i] = dizi1[i];
            }else {
                birlestirilmisDizi[i] = dizi2[i - boyut1];
            }
        }

        System.out.print("Birleştirilmiş dizi : " + Arrays.toString(birlestirilmisDizi));

        scan.close();
    }
}
