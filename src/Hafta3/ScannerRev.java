package Hafta3;

import java.util.Scanner;

public class ScannerRev {
    public static void main(String[] args) {
        Scanner yasHesap = new Scanner(System.in);
        System.out.println("Adı ne lo ?");
        String ad = yasHesap.next();
        System.out.println("doğumun ?");
        int yil = yasHesap.nextInt();
        int yas = (2022 - yil);
        System.out.println("Hello Mofo adın " + ad + " yaşın " + yas + "'dır." );

    }
}
