package arrays;
/**
 * Görev:
 * Kullanıcıdan bir dizi ve bir arama değeri al.
 * Eğer bu değer dizide varsa, indeksini yazdır
 */

import java.util.Scanner;

public class ArrayElementFinder {
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

        System.out.print("Aramak istediğiniz elemanı giriniz : ");
        int sayi = scan.nextInt();
        int index = 1;
        boolean bulundu = false;
        for (int eleman : dizi){

            if (sayi == eleman){
                bulundu = true;
                break;
            }
            index++;
        }
        if (bulundu){
            System.out.println(sayi +"-> Dizinin "+index+". Elemanı" );
        }
        scan.close();
    }
}
