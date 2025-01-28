package loopstructures;

import java.util.Scanner;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scan.nextInt();

        for (int i = 0; i <= sayi; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        scan.close();
    }
}
