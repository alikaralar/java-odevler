import java.util.Scanner;
public class Pratik4TaksimetreProgrami {
    public static void main(String[] args) {
    double kmBasina = 2.20, girilenDeger, toplamTutar;
    String odenecekTutar;
    System.out.print("Kaç km yol aldığınızı giriniz: ");
    Scanner input = new Scanner(System.in);
    girilenDeger = input.nextDouble();
    toplamTutar = girilenDeger*kmBasina;
    odenecekTutar = (toplamTutar <= 20) ? "Toplam 20 Tl ödemeniz gerekmektedir."
            : "Toplam " + toplamTutar+ "  TL Ödemeniz gerekmektedir." ;
    System.out.println(odenecekTutar);




    }
}
