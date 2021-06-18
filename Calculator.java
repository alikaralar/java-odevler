import java.util.Scanner;

public class Calculator {
    static void toplama(int a, int b) {
        int toplam = a + b;
        System.out.print("Girmiş olduğunuz sayıların toplamı: ");
        System.out.print(toplam);
    }

    static void cikarma(int a, int b) {
        int cikart = a - b;
        System.out.print("Girmiş olduğunuz sayıların farkı: ");
        System.out.print(cikart);
    }

    static void carpma(int a, int b) {
        int carp = a * b;
        System.out.print("Girmiş olduğunuz sayıların Çarpımı: ");
        System.out.print(carp);
    }

    static void bolme(int a, int b) {
        int bolum = a / b;
        System.out.print("Girmiş olduğunuz sayıların bölümü: ");
        System.out.print(bolum);
    }

    static void usAlma(int us, int taban) {
        int sonuc = 1;
        for (int i = 1; i <= us; i++) {
            if (us != 0) {
                sonuc *= taban;
            } else if (us == 0) {
                System.out.println("1");
            }

        }
        System.out.println(sonuc);

    }

    static void modAlma(int sayi, int mod) {
        int sonuc = sayi % mod;
        System.out.println(sonuc);
    }
    static void alanVeCevre(int a, int b){
        int alan = a*b;
        int cevre = 2*(a+b);
        System.out.println("Dikdörtgenin alanı: "+alan);
        System.out.print("Dikdörtgenin Çevresi: "+ cevre);

    }

    public static void main(String[] args) {
        int secim;
        String menu = """
                Lütfen yapmak istediğiniz işlemi seçiniz:
                1. Toplama
                2. Çıkarma
                3. Çarpma
                4. Bölme
                5. Üslü Sayı Hesaplama
                6. Mod Alma
                7. Dikdörtgen Çevre ve Alan Hesabı
                0. Çıkış Yap""";

        Scanner klavye = new Scanner(System.in);
        System.out.println(menu);
        secim = klavye.nextInt();


        while (secim>=1 && secim<=4) {
            System.out.print("İlk sayıyı giriniz: ");
            int sayi1 = klavye.nextInt();
            System.out.print("İkinci sayıyı giriniz: ");
            int sayi2 = klavye.nextInt();
            switch (secim) {
                case 1 -> toplama(sayi1, sayi2);
                case 2 -> cikarma(sayi1, sayi2);
                case 3 -> carpma(sayi1, sayi2);
                case 4 -> bolme(sayi1, sayi2);
            }
            break;
        }

        if (secim==0){
            System.out.println("Çıkış yapılmıştır.");
        }
        if (secim == 5) {
            System.out.print("Üssü giriniz: ");
            int us = klavye.nextInt();
            System.out.print("Tabanı giriniz: ");
            int taban = klavye.nextInt();
            usAlma(us, taban);
            return;
        }
        if (secim==6){
            System.out.print("Sayıyı giriniz: ");
            int sayi = klavye.nextInt();
            System.out.print("Hangi sayıyla mod almak istediğinizi giriniz: ");
            int mod = klavye.nextInt();
            System.out.print("Sonuç: ");
            modAlma(sayi,mod);
            return;
        }
        if (secim==7){
            System.out.print("İlk kenarı giriniz: ");
            int kenar1 = klavye.nextInt();
            System.out.print("İkinci kenarı giriniz: ");
            int kenar2 = klavye.nextInt();
            alanVeCevre(kenar1,kenar2);
            return;
        }
    }
}
