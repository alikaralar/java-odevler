import java.util.Scanner;
public class Pratik2KdvTutariHesaplayanProgram {
    public static void main(String[] args) {
        double girilenPara, kdv;
        Scanner input = new Scanner(System.in);
        System.out.print("Hesaplamak istediğiniz para miktarını giriniz: ");
        girilenPara = input.nextDouble();
        kdv = girilenPara <= 1000 ? girilenPara*0.18 : girilenPara*0.08;
        System.out.println("Girilen Para Miktarı: "+ girilenPara + " TL");
        System.out.print("KDV tutarınız: ");
        System.out.println(kdv + " TL");
        System.out.println("KDV'li tutarınız: "+ (kdv+girilenPara) + " TL");

    }
}
