import java.util.Scanner;

public class Odev5 {
    public static void main(String[] args) {
        int yil;
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        yil = input.nextInt();
        if ((yil % 4 == 0) || (yil % 400 == 0)) {
            System.out.println(yil + " Artık Yıldır.");

        }else{
            System.out.println(yil + " Artık Yıl Değildir!");
        }

    }
}
