package arrays;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Görev:
 * Kullanıcıdan bir dizi boyutu ve elemanlarını al.
 * Dizideki elemanların toplamını hesapla.
 */
public class ArraySumCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dizi boyutu giriniz: ");
        int boyut = scan.nextInt();
        int[] dizi = new int[boyut];

        int toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            int index = i + 1;
            System.out.print("Lütfen dizinin " + index +". elemanını giriniz: ");
            int eleman = scan.nextInt();
            dizi[i] = eleman;
            toplam += eleman;
        }


        System.out.println("Dizinizin içeriği: " + Arrays.toString(dizi));
        System.out.println("Dizi elemanlarının toplamı: " + toplam);

        scan.close();
    }
}
