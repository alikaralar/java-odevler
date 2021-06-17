//Palindrom sayı bulan program.
import java.util.Scanner;
public class PalindromSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int klavye = input.nextInt();
        int girdi = klavye;
        int sonSayi,sayi,ilkSayi=0;


        while (klavye!=0){
            sonSayi = klavye%10;
            ilkSayi = (ilkSayi*10) + sonSayi;
            sayi = klavye/10;
            klavye = sayi;
            if (girdi==ilkSayi){
                System.out.println(girdi + " Palindrom Sayıdır.");
            }
        }if (girdi!=ilkSayi){
            System.out.println(girdi + " Palindrom Sayı Değildir!");
        }

    }

}
