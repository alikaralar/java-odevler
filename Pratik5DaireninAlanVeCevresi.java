import java.util.Scanner;
public class Pratik5DaireninAlanVeCevresi {
    public static void main(String[] args) {
        double pi = 3.14, alanHesabi, cevreHesabi, yariCap;
        System.out.print("Dairenin yarıçapını giriniz: ");
        Scanner input = new Scanner(System.in);
        yariCap = input.nextDouble();
        alanHesabi = pi*yariCap*yariCap;
        cevreHesabi = 2*pi*yariCap;
        System.out.println("Girmiş olduğunuz dairenin alanı: "+ alanHesabi);
        System.out.println("Girmiş olduğunuz dairenin çevresi: "+ yariCap);




    }
}
