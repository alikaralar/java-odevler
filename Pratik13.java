//Java ile kombinasyon hesaplayan program.
import java.util.Scanner;
public class Pratik13 {
    public static void main(String[] args) {
       int elemanSayisi, secimSayisi,faktoriyelN,n=1,r=1,faktoriyelR,cSonuc,c,tumSonuc=1;
       Scanner input = new Scanner(System.in);
       System.out.print("Eleman sayısını giriniz (n): ");
       elemanSayisi = input.nextInt();
       System.out.print("Seçim sayısını giriniz (r): ");
       secimSayisi = input.nextInt();



       for (faktoriyelN=1; faktoriyelN<=elemanSayisi; faktoriyelN++){
           n = n*faktoriyelN;

       }
        //System.out.println(n);
       for (faktoriyelR=1; faktoriyelR<=secimSayisi; faktoriyelR++){
           r = r*faktoriyelR;
       }
        //System.out.println(r);
       c = (elemanSayisi-secimSayisi);
       for (cSonuc=1; cSonuc<=c; cSonuc++ ){
           tumSonuc = cSonuc*tumSonuc;
       }
        System.out.println((n/(r*(tumSonuc))));
        //System.out.println(tumSonuc);
       
    }
}
