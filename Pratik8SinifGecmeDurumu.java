import java.util.Scanner;
public class Pratik8SinifGecmeDurumu {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,ortalama;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notunuzu giriniz: ");
        mat = input.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        System.out.print("Kimya notunuzu girniz: ");
        kimya = input.nextInt();
        System.out.print("Turkce notunuzu giriniz: ");
        turkce = input.nextInt();
        ortalama = (mat+fizik+kimya+turkce)/4;

        if (ortalama < 55){
            System.out.println("Sınıfı geçemediniz.");
        }else if (ortalama >= 55){
            System.out.println("Tebrikler! Sınıfı geçtiniz.");
        }else if (ortalama<0 && ortalama>100){
            System.out.println("Geçersiz işlem algılandı!" +
                    " Lütfen girmiş olduğunuz notları tekrar kontrol ediniz.");
        }
        System.out.println("Ortalamanız: "+ortalama);
    }
}
