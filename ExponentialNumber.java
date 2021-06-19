import java.util.Scanner;

public class ExponentialNumber {
    static void usAlma(int us, int taban) {
        int sonuc = 1;
        for (int i = 1; i <= us; i++) {
            sonuc *= taban;
        }
        System.out.print("Sonuç: ");
        System.out.print(sonuc);
    }

    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        int taban = klavye.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int us = klavye.nextInt();

        usAlma(us, taban);
    }
}
