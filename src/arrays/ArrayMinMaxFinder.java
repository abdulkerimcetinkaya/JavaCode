package arrays;
/**
 * Görev:
 *
 * Kullanıcıdan bir dizi elemanlarını al.
 * Dizideki en büyük ve en küçük sayıyı bul ve ekrana yazdır.
 */

import java.util.Scanner;

public class ArrayMinMaxFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen dizi boyutu giriniz: ");
        int boyut = scan.nextInt();
        int[] dizi = new int[boyut];


        for(int i = 0; i <dizi.length; i++){
            int index = i + 1;
            System.out.print("Dizinin "+index+ ". elemanını giriniz: ");
            int eleman = scan.nextInt();
            dizi[i] = eleman;
        }

        int enBuyukSayi = dizi[0];
        int enKucukSayi = dizi[0];
        for (int eleman : dizi){
            if (enBuyukSayi < eleman){
                enBuyukSayi = eleman;
                break;
            }

            if (enKucukSayi > eleman){
                enKucukSayi = eleman;
                break;
            }
        }
        System.out.println("-------------------------------------");
        System.out.println("Dizide En Büyük Sayı : "+ enBuyukSayi);
        System.out.println("Dizide En Küçük Sayı : "+ enKucukSayi);

        scan.close();
    }
}
