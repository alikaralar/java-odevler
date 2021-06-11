import java.util.Scanner;
public class Pratik16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        double harmonik=0.0;
        System.out.print("Sayı giriniz: ");
        n = input.nextInt();
        for (double i = 1; i<=n; i++){
            harmonik += (1/i);
            System.out.println(harmonik);

        }
        System.out.println(harmonik);

    }
}
