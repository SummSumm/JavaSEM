package Hafta3.ders;
import java.util.Scanner;

public class scannerKullanimi {
    // Bu konsol uygulama programı, adı ve yaşı klavyeden okur
    // ve ekrana yazar.

        public static void main(String[] args) {

            Scanner oku = new Scanner(System.in);
            System.out.print("Adınız ve Yaşınız: ");
            String ad = oku.next(); // next=String
            int yas = oku.nextInt(); //nextInt = int

            System.out.println("Merhaba Sayın " + ad);
            System.out.println("Yaşınız " + yas);

            System.out.println("----------------------------------------");
            // Scanner nesnesini olustur
            Scanner klavye = new Scanner(System.in);
            // kullanıcıdan x degerini al
            System.out.print("Bir reel sayı giriniz: ");
            double x = klavye.nextDouble();

            double kareKok = x*x;
            System.out.println ("X=" + x + " in karekoku = " + kareKok);
        }
    }

