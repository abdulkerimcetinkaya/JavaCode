package controlstructures;

import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Üçgenin 1. açısını giriniz: ");
        int a = scan.nextInt();

        System.out.print("Üçgenin 2. açısını giriniz: ");
        int b = scan.nextInt();

        System.out.print("Üçgenin 3. açısını giriniz: ");
        int c = scan.nextInt();

        // Üçgen kontrolü
        if (a + b + c != 180) {
            System.out.println("Bu açılar bir üçgen oluşturamaz! Üçgenin iç açıları toplamı 180 derece olmalıdır.");
        } else {
            if (a == b && b == c) {
                System.out.println("Eşkenar Üçgen");
            } else if (a == b || b == c || a == c) {
                System.out.println("İkizkenar Üçgen");
            } else {
                System.out.println("Çeşitkenar Üçgen");
            }
        }

        scan.close();
    }
}
