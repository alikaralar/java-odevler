//Java ile iki sayının EBOB ve EKOK değerlerini bulan program.
import java.util.Scanner;
public class Pratik18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ebob = 1;
        System.out.print("EBOB hesaplamak için 1 ve EKOK hesaplamak için 2 tuşuna basınız: ");
        int secim = input.nextInt();
        if (secim==1){
            System.out.print("İlk Sayıyı Giriniz: ");
            int sayi1 = input.nextInt();
            System.out.print("İkinci sayıyı giriniz: ");
            int sayi2 = input.nextInt();
            if (sayi1>sayi2){
                for (int i = 1; i<=sayi2; i++){
                    if (sayi2 % i == 0 && sayi1 % i == 0) {
                        ebob = i;
                    }
                }
                System.out.println("Girilen sayının EBOB'u: "+ebob);
            }else if (sayi1<sayi2){
                for (int k = 1; k<=sayi1; k++){
                    if (sayi1 % k == 0 && sayi2 % k ==0){
                        ebob =k;
                    }
                }
                System.out.println("Girilen sayıların EBOB'u: "+ebob);


            }
        }else if (secim==2){
            int ekok = 0;
            int max;
            System.out.print("İlk Sayıyı Giriniz: ");
            int sayi1 = input.nextInt();
            System.out.print("İkinci sayıyı giriniz: ");
            int sayi2 = input.nextInt();
            max = sayi1 * sayi2;
            for(int i = max; i > 0; i--)
            {
                if(i % sayi1 == 0 && i % sayi2 == 0) {
                    ekok = i;
                }
            }System.out.println("Girilen sayıların EKOK'u : " + ekok);
        }

    }
}
