import java.util.Scanner;
public class Pratik7KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kullaniciAdi,onay,yeniSifre;
        System.out.print("Kullanıcı adınızı giriniz: ");
        kullaniciAdi = input.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        String sifre = input.nextLine();
        if (kullaniciAdi.equals("java") && sifre.equals("1234")){
            System.out.println("Başarılı bir şekilde giriş yaptınız.");

        }else if (kullaniciAdi.equals("ali") && sifre!="1234"){
            System.out.println("Şifrenizi yanlış girdiniz. " +
                    "Değiştirmek ister misiniz?");
            onay = input.nextLine();
            if (onay.equals("e")){
                System.out.println("Değiştirmek istediğiniz şifreyi giriniz.");
                yeniSifre = input.nextLine();
                if (yeniSifre.equals(sifre)){
                    System.out.println("Girmiş olduğunuz şifre eski şifrenizle aynı.");
                }else {
                    sifre = yeniSifre;
                    System.out.println("Şifreniz değiştirilmiştir.");
                }
                //sifre = (sifre.equals(yeniSifre)) ? "Eski şifrenizi girdiniz." : "Şireniz oluşturuluyor...";
                //sifre = yeniSifre;
                //yeniKullaniciAdi = input.nextLine();
                //kullaniciAdi = yeniKullaniciAdi;


            }else if (onay.equals("h")){
                System.out.println("Sistemden çıkış yapılıyor...");

            }else {
                System.out.println("Geçersiz bir karekter girdiniz.");
            }

        }

    }
}
