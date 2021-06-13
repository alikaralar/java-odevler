import java.util.*;
class MukemmelSayi {
    public static void main(String[] args) {
        int toplam=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();


        for (int i=1; i<sayi; i++){
            if (sayi % i ==0){
                toplam +=i;
            }
        }
        if (sayi==toplam){
            System.out.println(sayi + " Mükemmel sayıdır.");
        }else {
            System.out.println(sayi+" Mükemmel sayı değildir.");
        }


    }
}