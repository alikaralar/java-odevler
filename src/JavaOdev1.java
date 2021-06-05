//Scanner import edildi.
import java.util.Scanner;
public class JavaOdev1 {
    public static void main(String[] args) {

        int matVize, matFinal, fizikVize, fizikFinal, kimyaVize, kimyaFinal;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik vize sınav notunuzu giriniz: ");
        matVize = input.nextInt();
        System.out.print("Matematik final sınavı notunuzu giriniz: ");
        matFinal = input.nextInt();
        double matOrtalama = ((matVize+matFinal)/2);
        String matDurum = ((matVize+matFinal)/2 >= 60) ? "Matematik Dersinden GEÇTİNİZ."
                : "Matematik Dersinden KALDINIZ.";
        System.out.println("Ders Ortalamanız "+matOrtalama+ " Puan, ");
        System.out.println(matDurum);



        System.out.print("Fizik vize sınav notunuzu giriniz: ");
        fizikVize = input.nextInt();
        System.out.print("Fizik final sınavı notunuzu giriniz: ");
        fizikFinal = input.nextInt();
        double fizikOrtalama = ((fizikVize+fizikFinal)/2);
        String fizikDurum = ((fizikVize+fizikFinal)/2 >= 60) ? "Fizik Dersinden GEÇTİNİZ."
                : "Fizik Dersinden KALDINIZ.";
        System.out.println("Ders Ortalamanız "+fizikOrtalama+ " Puan, ");
        System.out.println(fizikDurum);



        System.out.print("Kimya vize sınav notunuzu giriniz: ");
        kimyaVize = input.nextInt();
        System.out.print("Kimya final sınavı notunuzu giriniz: ");
        kimyaFinal = input.nextInt();
        double kimyaOrtalama = ((kimyaVize+kimyaFinal)/2);
        String kimyaDurum = ((kimyaVize+kimyaFinal)/2 >= 60) ? "Kimya Dersinden GEÇTİNİZ."
                : "Kimya Dersinden KALDINIZ.";
        System.out.println("Ders Ortalamanız "+kimyaOrtalama+ " Puan, ");
        System.out.println(kimyaDurum);

    }
}
