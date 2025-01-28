package controlstructures;
import java.util.Scanner;
public class TemperatureStatus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz: ");
        int sicaklik = scan.nextInt();

        if (sicaklik < 0){
            System.out.println("Haca çok soğuk!");
        }else if (sicaklik < 15){
            System.out.println("Hava serin!");
        }else if (sicaklik < 30){
            System.out.println("Hava güzel!");
        }else {
            System.out.println("Hava çok sıcak!");
        }

        scan.close();
    }
}
