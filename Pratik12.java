//Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program.
import java.util.Scanner;
public class Pratik12 {
    public static void main(String[] args) {
        int k,i;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        k = input.nextInt();
        for (i=1; i<=k; i*=20){
            System.out.println(i);
        }
    }
}
