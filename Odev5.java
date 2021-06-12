//En büyük ve en küçük sayıları bulan program.
import java.util.Scanner;

public class Odev5 {
    public static void main(String[] args) {
        int girdi,sayi=0,enBuyuk,enKucuk;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz:");
        girdi = input.nextInt();
        enBuyuk = sayi;
        enKucuk =sayi;

        for (int i = 1; i<=girdi; i++){
            System.out.print(i + ". Sayıyı giriniz: ");
            sayi = input.nextInt();
            if (sayi>enBuyuk){
                enBuyuk=sayi;

            }else if (sayi<enKucuk){
                enKucuk=sayi;
            }
        }
        System.out.println("En büyük sayı: "+ enBuyuk);
        System.out.println("En küçük sayı: "+ enKucuk);

    }
}
