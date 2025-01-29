package Methods;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen birinci sayıyı giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz: ");
        int sayi2 = scan.nextInt();

        boolean bitis = true;

        while (bitis) {
            System.out.print("1 -> +\n2 -> -\n3 -> *\n4 -> /\n0 -> Çıkış\nBir işlem Seçiniz: ");
            int islem = scan.nextInt();  // Türü int olarak düzenlendi.

            switch (islem) {
                case 1:
                    System.out.println("Toplama sonucu: " + sum(sayi1, sayi2));
                    break;
                case 2:
                    System.out.println("Çıkarma sonucu: " + subtract(sayi1, sayi2));
                    break;
                case 3:
                    System.out.println("Çarpma sonucu: " + multiply(sayi1, sayi2));
                    break;
                case 4:
                    System.out.println("Bölme sonucu: " + divide(sayi1, sayi2));
                    break;
                case 0:
                    System.out.println("Görüşmek üzere!");
                    bitis = false;
                    break;
                default:
                    System.out.println("Geçersiz işlem! Lütfen 0-4 arasında bir değer giriniz.");
            }
        }
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static String divide(int a, int b) {
        if (b == 0) {
            return "Hata: Sıfıra bölme işlemi yapılamaz!";
        }
        return String.valueOf(a / b);
    }
}
