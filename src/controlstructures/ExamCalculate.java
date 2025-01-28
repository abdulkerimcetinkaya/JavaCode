package controlstructures;

import java.util.Scanner;

public class ExamCalculate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen notunuzu giriniz (0-100): ");
        double not = scan.nextDouble();


        if (not < 0 || not > 100) {
            System.out.println("Geçersiz bir not girdiniz! Not 0 ile 100 arasında olmalıdır.");
        } else if (not >= 85) {
            System.out.println("Tebrikler, AA aldınız!");
        } else if (not >= 70) {
            System.out.println("Notunuz: BB");
        } else if (not >= 50) {
            System.out.println("Notunuz: CC");
        } else { // FF
            System.out.println("Maalesef dersten kaldınız, Notunuz: FF");
        }

        scan.close();
    }
}
