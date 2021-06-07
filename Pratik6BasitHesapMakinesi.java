import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Pratik6BasitHesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner input = new Scanner(System.in);
        System.out.println("1 Çarpma:\n2 Bölme:\n3 Toplama:\n4 Çıkarma:");
        System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
        select = input.nextInt();
        System.out.print("İlk sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Çarpım: " + (n1 * n2));
                break;
            case 2:
                System.out.println("Bölüm: " + (n1 / n2));
                break;
            case 3:
                System.out.println("Toplam: " + (n1 + n2));
                break;
            case 4:
                System.out.println("Çıkarma: " + (n1 - n2));
                break;
            default:
                System.out.println("Yanlış bir işlem yaptınız. Lütfen tekrar deneyiniz.");
                break;
        }


    }
}
