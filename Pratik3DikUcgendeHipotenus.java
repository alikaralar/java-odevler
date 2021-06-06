import java.util.Scanner;
public class Pratik3DikUcgendeHipotenus {
    public static void main(String[] args) {
        double kenar1, kenar2, kenar3, ucgeninCevresi, cevreninYarisi, alan;
        Scanner input = new Scanner(System.in);
        System.out.print("1.Kenarı giriniz: ");
        kenar1 = input.nextDouble();
        System.out.print("2.Kenarı giriniz: ");
        kenar2 = input.nextDouble();
        System.out.print("3.Kenarı giriniz: ");
        kenar3 = input.nextDouble();
        ucgeninCevresi = kenar1+kenar2+kenar3;
        cevreninYarisi = (ucgeninCevresi/2);
        alan = Math.sqrt(cevreninYarisi*(cevreninYarisi-kenar1)*
                (cevreninYarisi-kenar2)*(cevreninYarisi-kenar3));
        System.out.println("Girmiş olduğununz üçgenin çevresi: "+ ucgeninCevresi + " birm.");
        System.out.print("Girmiş olduğunun bilgilere göre üçgenin alanı: "+ alan+ " birim kare");





    }
}
