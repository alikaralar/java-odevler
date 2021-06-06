import java.util.Scanner;
public class odev1VucutKitleIndeksi {
    public static void main(String[] args) {
    double boy,kilo,vucutKitleIndeksi;
    Scanner girdi = new Scanner(System.in);
    System.out.print("Lütfen boyunuzu metre (m) cinsinden giriniz: ");
    boy = girdi.nextDouble();
    System.out.print("Lütfen kilonuzu kilogram (kg) cinsinden giriniz: ");
    kilo = girdi.nextDouble();
    vucutKitleIndeksi = kilo/(boy*boy);
    System.out.println("Vücut kitle indeksiniz: "+ vucutKitleIndeksi);

    }
}
