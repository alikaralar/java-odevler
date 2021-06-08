import java.util.Scanner;
public class Odev4 {
    public static void main(String[] args) {
        int dogumYili,cinZodyagi;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz:");
        dogumYili = input.nextInt();
        cinZodyagi = ((dogumYili) % 12);
        switch (cinZodyagi) {
            case 0 -> System.out.println("Maymun");
            case 1 -> System.out.println("Horoz");
            case 2 -> System.out.println("Köpek");
            case 3 -> System.out.println("Domuz");
            case 4 -> System.out.println("Fare");
            case 5 -> System.out.println("Öküz");
            case 6 -> System.out.println("Kaplan");
            case 7 -> System.out.println("Tavşan");
            case 8 -> System.out.println("Ejderha");
            case 9 -> System.out.println("Yılan");
            case 10 -> System.out.println("At");
            case 11 -> System.out.println("Koyun");
        }
    }
}
