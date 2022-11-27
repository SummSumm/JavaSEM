package Hafta3;

import java.io.IOException;
import java.util.Scanner;

public class genelRev {
    public static void main(String[] args) throws IOException {
        // VARIABLE NEDIR
        int num1 = 9;
        int num2 = 34;
        String isim = "Plato";

        System.out.println(isim + "'nun yaşı" + (num1 + num2) + "değildir.");

        // OBJECT NEDIR
        Scanner scan = new Scanner(System.in); // obje
        System.out.println("yaşınızı giriniz");
        int yas = scan.nextInt(); // variable çünkü bunu kullanıcam
        System.out.println("Kişinin yaşı= " + yas);


    }

    public static class ScannerRev {
        public static void main(String[] args) {
            Scanner oku = new Scanner(System.in);
            System.out.println("Adınız = ");
            String ad = oku.next();
            System.out.println("Doğduğunuz yıl = ");
            int yil = oku.nextInt();
            int yas = (2022-yil);
            System.out.println("Merhaba " + ad + " yaşınız " + yas + "'dır.");

        }
    }
}
