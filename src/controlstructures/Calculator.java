package controlstructures;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int sayi1 = scan.nextInt();

        System.out.print("Bir sayi giriniz : ");
        int sayi2 = scan.nextInt();

        System.out.print("Toplama(+) \nCikarma(-) \nCarpma(*) \nBolme(/) \nBir işlem Seçiniz: ");
        char islem = scan.next().charAt(0);

        switch (islem){
            case '+':
                System.out.println("Toplama sonucu: "+(sayi1+sayi2));
                break;
            case '-':
                System.out.println("Cikarma sonucu: "+(sayi1-sayi2));
                break;
            case '*':
                System.out.println("Carpma sonucu: "+(sayi1*sayi2));
                break;
            case '/':
                if (sayi2 == 0){
                    System.out.println("Hata : Bir sayıyı 0'a bölemezsiniz!");
                    break;
                }
                System.out.println("Bolme sonucu: "+(sayi1/sayi2));
                break;
            default:
                System.out.println("Hatali islem girdiniz!");
                break;
        }

        scan.close();
    }
}
