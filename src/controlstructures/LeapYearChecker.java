package controlstructures;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir yıl giriniz: ");
        int yil = scan.nextInt();

        if(yil % 4 == 0 && yil % 100!= 0 || yil % 400 == 0){
            System.out.println("Bu yıl artık yıldır!");
        }else {
            System.out.println("Bu yıl artık yıl değildir!");
        }
        scan.close();
    }
}
