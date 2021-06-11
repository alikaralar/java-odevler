//Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
import java.util.Scanner;

public class Pratik17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,toplam=0;
        System.out.print("Sayı giriniz: ");
        n = input.nextInt();
        while (n>0){
            toplam = toplam + (n % 10);//1234 --> kalan = 4
            n = n/10;

        }
        System.out.println("Girilen Sayının Rakamları Toplamı: " +toplam);



    }
}
