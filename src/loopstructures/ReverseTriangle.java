package loopstructures;
/**
 * Görev: Kullanıcıdan bir yükseklik değeri al ve ters üçgen şeklini konsola çizdir.
 */

import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir yükseklik değeri giriniz : ");
        int yukseklik = scan.nextInt();

        for(int i = yukseklik; i >= 1; i--){
            for (int j = 0; j < yukseklik - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scan.close();
    }
}
