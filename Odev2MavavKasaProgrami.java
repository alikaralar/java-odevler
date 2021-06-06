import java.util.Scanner;
public class Odev2MavavKasaProgrami {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11,
                muz = 0.95, patlican = 5.0, toplam, armutKilo,
                elmaKilo, domatesKilo,muzKilo,patlicanKilo;

        Scanner girdi = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo? : ");
        armutKilo = girdi.nextDouble();
        System.out.print("Elma Kaç Kilo? : ");
        elmaKilo = girdi.nextDouble();
        System.out.print("Domates Kaç Kilo? : ");
        domatesKilo = girdi.nextDouble();
        System.out.print("Muz Kaç Kilo? : ");
        muzKilo = girdi.nextDouble();
        System.out.print("Patlıcan Kaç Kilo? : ");
        patlicanKilo = girdi.nextDouble();
        toplam = (armut*armutKilo)+(elma*elmaKilo)+(domates*domatesKilo)
                +(muz*muzKilo)+(patlican*patlicanKilo);
        System.out.println("Toplam Tutar : "+ toplam);






    }
}
