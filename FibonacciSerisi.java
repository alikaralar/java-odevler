//Fibonacci serisi hesaplayan program.
import java.util.Scanner;
public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.print("Kaç Adet Fibonnacci Sayısı Görmek İstiyorsunuz? :");
        int sayi=klavye.nextInt();
        int a=1;
        int b=1;
        int c;

        System.out.println("0\n"+a);
        System.out.println(b);

        for (int i=0; i<=sayi; i++){
            c = a+b;
            a=b;
            b=c;
            System.out.println(c);

        }




    }
}
