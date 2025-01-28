package controlstructures;

import java.util.Scanner;
public class CompareTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("birinci sayıyı giriniz: ");
        int sayi1 = scan.nextInt();

        System.out.print("ikinci sayıyı giriniz: ");
        int sayi2 = scan.nextInt();

        if (sayi1 > sayi2){
            System.out.println(sayi1+", "+sayi2+"'den daha büyük");
        }else if (sayi1 < sayi2){
            System.out.println(sayi2+", "+sayi1+"'den daha büyük");
        }else{
            System.out.println(sayi1+" ve "+sayi2+" birbirine eşittir");
        }

        scan.close();
    }
}
