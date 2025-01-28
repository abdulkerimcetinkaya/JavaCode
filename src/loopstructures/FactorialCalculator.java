package loopstructures;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayı giriniz: ");
        int sayi = scan.nextInt();
        int factorial = 1;

        for(int i = sayi; i > 0; i--){
            factorial *= i;
        }
        System.out.println("Girdiğiniz sayının faktoriyeli : "+ factorial);

        scan.close();
    }
}
