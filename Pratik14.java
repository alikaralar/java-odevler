//Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan program.
import java.util.Scanner;
public class Pratik14 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.print("Tabanı giriniz: ");
        int a=input.nextInt();

        System.out.print("Üssü giriniz: ");
        int b=input.nextInt();



        int carpim=1;
        for (int i=1; i<=b; i++)
            carpim*=a;

        System.out.println("Cevap:"+ carpim);
    }
}
