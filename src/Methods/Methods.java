package Methods;
import java.time.LocalDate;
import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Methods {
    public static void main(String[] args) {
//        System.out.println(new Methods().generateRandomNumber()); // Non-Static Method
//        System.out.println(getFixedMessage()); // Static Method
//        System.out.println(new Methods().getCurrentDateTime()); // Non-Static Method

//        new Methods().printMessage(); // Non-Static Method
//        new Methods().printCurrentDate(); // Non-Static Method
//        printList(); // Static Method

//        new Methods().printWelcomeMessage("Kerim"); // Non-Static Method
//        new Methods().printEvenNumber(10); // Non-Static Method
//        printCharFrequency("Merhaba Java!", 'a'); // Static Method

//        int[] arr = new int[]{1,2,3};
//        System.out.println(sumArray(arr));
//        System.out.println(isPalindrome("rotor"));
//        System.out.println(convertToFahrenheit(1));

    }

    // Parametre almayan ve geriye değer döndüren metotlar.
    public int generateRandomNumber(){
        return (int)(Math.random()*100);
    }

    public static String getFixedMessage(){
        return "Hello Java!";
    }

    public String getCurrentDateTime(){
        return LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    // --------------------------------------------------------------

    // Paramtere almayan ve geriye değer döndürmeyen metotlar.
    public void printMessage(){
        System.out.println("Hello World!");
    }

    public void printCurrentDate(){
        System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    public static void printList(){
        String[] sehir = {"Karabük","İstanbul", "Ankara","Manisa","İzmir","Yalova","Konya"};
        System.out.println("Şehirlerin Listesi\n----------------");
        for(String s:sehir){
            System.out.println(s);
        }
    }

    // --------------------------------------------------------------

    // Paramtere alan ve geriye değer döndürmeyen metotlar.
    public void printWelcomeMessage(String name){
        System.out.println("Merhaba "+name);
    }

    public void printEvenNumber(int limit){
        for(int i=0;i<=limit;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }

    public static void printCharFrequency(String text, char c){
        int count = 0;
        text = text.toLowerCase();
        c = Character.toLowerCase(c);
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==c){
                count++;
            }
        }
        System.out.println("Aradığınız "+c+" harfi kelimede "+count+" kere geçiyor.");
    }

    // --------------------------------------------------------------

    // Parametre alan ve geriye değer döndüren metotlar.
    public static int sumArray(int[] arr){
        int sum = 0;

        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }

        return sum;
    }

    public static boolean isPalindrome(String str){
        boolean isPalindrome = false;
        String reverseStr = "";
        for(int i=str.length()-1;i>=0;i--){
            reverseStr += str.charAt(i);
        }
        if(str.equals(reverseStr)){
            isPalindrome = true;
        }
        return isPalindrome;
    }

    public static double convertToFahrenheit(double celsius){
        return (celsius*9/5)+32;
    }

}
