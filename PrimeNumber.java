import java.util.Scanner;

public class PrimeNumber {
    static void asalSayi(int sayi){
        int asalMi;
        if (sayi==1){
            System.out.println(sayi + " Sayıyı Asal Değildir.");
        }
        for (int i=2; i<=sayi; i++){
            if (sayi==2){
                System.out.println(sayi+" Sayısı Asal Sayıdır.");
                break;
            }
            asalMi = sayi%i;
            if (asalMi==0){
                System.out.println(sayi + " Sayısı Asal Sayı Değildir.");
                break;
            }
            if (i == sayi-1){
                System.out.println(sayi+" Sayısı Asal Sayıdır.");
                break;
            }

        }
    }
    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int sayi = klavye.nextInt();

        asalSayi(sayi);


    }
}
