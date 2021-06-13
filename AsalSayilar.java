//Asal sayıları bulan program.
import java.util.Scanner;
public class AsalSayilar {
    public static void main(String[] args) {
        int s;
        Scanner klavye = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int girdi = klavye.nextInt();

        for (int i = 2; i<=girdi; i++){
            s=0;
            for (int j=1; j<=i; j++){
                if (i%j == 0){
                    s++;
                }
            }
            if (s==2){
                System.out.println(i);
            }
        }
    }
}
