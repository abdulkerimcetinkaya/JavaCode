package controlstructures;

import java.util.Scanner;

public class SeasonChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir ay indeksi giriniz (1-12): ");
        int ay = scan.nextInt();

        switch (ay) {
            case 12:
            case 1:
            case 2:
                System.out.println("Kış Mevsimi");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("İlkbahar Mevsimi");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz Mevsimi");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar Mevsimi");
                break;
            default:
                System.out.println("Geçerli bir ay giriniz! (1-12 arasında bir değer)");
                break;
        }

        scan.close();
    }
}
