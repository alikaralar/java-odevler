import java.util.Scanner;
public class Pratik10 {
    public static void main(String[] args) {
        int k,i;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        k = input.nextInt();
        for (i=1; i<=k; i++){
            if (i%3 == 0 && i%4 == 0){
                System.out.println(i);

            }
        }

    }
}
