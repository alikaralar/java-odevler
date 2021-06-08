import java.util.Scanner;
public class Odev3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mesafe,yolculukTipi,yas;
        double toplamTutar;
        System.out.print("Mesafeyi giriniz: ");
        mesafe = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();
        System.out.println("Yolculuk tipini giriniz: "+ "1 --> Tek yön, 2 --> Gidiş dönüş.");
        yolculukTipi = input.nextInt();
        toplamTutar = (mesafe*0.10);

        if (yas<12 && yolculukTipi == 1){
            System.out.println(toplamTutar/2 + "TL");
        }else if (yas<=12 && yolculukTipi == 2){
            System.out.println(((2*toplamTutar)/2)*0.2 + "TL");
        }else if (yas>12 && yas<24 && yolculukTipi ==1){
            System.out.println((toplamTutar)*0.1 + "TL");
        }else if (yas>65 && yolculukTipi==1) {
            System.out.println((toplamTutar)*0.3 + "TL");
        }else if (yas>12 && yas<24 && yolculukTipi == 2){
            System.out.println(((toplamTutar*2)*0.1)*0.2 + "TL");
        }else if (yas>65 && yolculukTipi==2){
            System.out.println(((toplamTutar*2)*0.3)*0.2 + "TL");
        }else if (yas<1){
            System.out.println("Hatalı giriş yaptınız!");
        }else if (mesafe<1){
            System.out.println("Hatalı giriş yaptınız!");
        }else if (yolculukTipi != 1 || yolculukTipi != 2){
            System.out.println("Hatalı giriş yaptınız!");
        }else {
            System.out.println("Hatalı giriş yaptınız!");
        }

    }
}
