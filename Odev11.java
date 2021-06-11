import java.util.Scanner;
public class Odev11 {
    public static void main(String[] args) {
        int k,i;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        k=input.nextInt();
        if (k%2 == 1){
            System.out.println("Yanlış bir değer girdiniz.");
        }else if (k%2 == 0){
            for (i=1; i<=k; i++){
                if (i%2 == 0 && i%4 == 0){
                    System.out.println(i);

                }

            }
        }

    }
}
