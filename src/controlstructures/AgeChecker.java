package controlstructures;
import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen yaşınızı giriniz: ");
        int yas = scan.nextInt();


        if (yas < 0) {
            System.out.println("Yaş 0'dan küçük olamaz!");
        } else if (yas < 18) {
            System.out.println("Reşit değilsiniz!");
        } else if (yas < 65) {
            System.out.println("Çalışma çağındasınız.");
        } else {
            System.out.println("Emeklilik yaşındasınız.");
        }
    }
}
