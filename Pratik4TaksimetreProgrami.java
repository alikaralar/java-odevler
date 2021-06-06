import java.util.Scanner;
public class Pratik4TaksimetreProgrami {
    public static void main(String[] args) {
    double kmBasina = 2.20, km, toplamTutar, acilisFiyati = 10;
    String odenecekTutar;
    System.out.print("Kaç km yol aldığınızı giriniz: ");
    Scanner input = new Scanner(System.in);
    km = input.nextDouble();
    toplamTutar = (km*kmBasina)+acilisFiyati;
    odenecekTutar = (toplamTutar <= 20) ? "Toplam 20 Tl ödemeniz gerekmektedir."
            : "Toplam " + toplamTutar+ "  TL Ödemeniz gerekmektedir." ;
    System.out.println(odenecekTutar);


    }
}
