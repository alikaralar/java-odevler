import java.util.Scanner;
public class Pratik9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sicaklik;
        System.out.print("Lütfen hava sıcaklığını giriniz: ");
        sicaklik = input.nextInt();
        if (sicaklik<5){
            System.out.println("Hava sıcaklığına göre en iyi " +
                    "etkinlik kayak yapmak gibi gözüküyor.");
        }else if (sicaklik<=15 && sicaklik>=5){
            System.out.println("Hava sıcaklığına göre en iyi etkinlik " +
                    "Sinemaya gitmek olacaktır.");
        }else if (sicaklik>=10 && sicaklik<=25){
            System.out.println("Hava sıcaklığına göre en iyi etkinlik " +
                    "Piknik yapmak olacaktır.");
        }else if (sicaklik>25 && sicaklik<50){
            System.out.println("Hava sıcaklığına göre en iyi etkinlik " +
                    "yüzmek olacaktır.");
        }else {
            System.out.println("Evden Çıkma :)");
        }
    }
}
