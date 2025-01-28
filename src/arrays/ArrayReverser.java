package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverser {
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
        int[] tersList = new int[boyut];
        for(int i = dizi.length; i > 0; i--){
            tersList[dizi.length - i] = dizi[i-1];
        }

        System.out.println("Normal Liste :" + Arrays.toString(dizi));
        System.out.println("Ters Liste "+ Arrays.toString(tersList));
    }
}
