package NesneYonelimliProgramlamaKitap;

import java.util.Scanner;

public class ParolaTest {
    public static void main(String[] args) {
        Scanner gir = new Scanner(System.in);
        String sifre = "arif123";
        int sayac=0;
        do {
            System.out.printf("Parola gir?");
            String girilen = gir.next();
            if (sifre.equals(girilen)){
                /*altenatifi :::: (sifre.compareTo(girilen))*/
                System.out.println("Parola doğru");
                break;
            }
            sayac++;
        }while (sayac<3);//do while
        if (sayac>=3)
        System.out.println("Hatalı parola girdin'' \nHakkınız doldu");
    }//main sonu
}//class sonu
