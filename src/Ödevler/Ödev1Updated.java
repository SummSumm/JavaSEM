package Ödevler;

import java.util.Scanner;

public class Ödev1Updated {
    public static void main(String[] args) {
          /*
        0. Scanner kurulur

        1. Print komutu ile Kullanıcıdan sınav adı istenir
        String examName = Scanner'dan gelen dizgi
        2. Print komutu ile Kullanıcıdan sınav başlangıcının saati tamsayı olarak istenir
        int starthour = Scanner'dan gelen int
        3. Print komutu ile Kullanıcıdan sınav başlangıcının dakikası tamsayı olarak istenir
        int startmin = Scanner'dan gelen int;
        4. Print komutu ile Kullanıcıdan sınav suresi toplam dakika olarak tamsayı olarak istenir
        int time = Scannerdan gelen int;
        5. sureninTamamı variableına startHour'ın 60 ile çarpımına start min eklenerek toplam olarak dakika karşılığı bulunur.
        Sonra da buna yeni eklenecek sure (time) eklenir. Bu şekilde sınav süresinin bütünü bulunur.
        Artık bu dakika bütününden saat ve dakikayı hesaplamalıyız.
        6. sureninTamamının 60a tam sayı olarak bölünerek bitiş saati bulunur (YeniSaat)
        7. sureninTamamının 60a tam sayı olarak bölümünden kalanından bitiş dakikası bulunur (YeniDakika)

        Print kodumuzu girerken saat için 6. maddeden bulduğumuz tamsayıyı ekleriz
                                dakika için ise 7. maddeden bulduğumuz dakikayı ekleriz
       System.out.println(examName + " sınavı " + startHour + ":" + startmin + "'da başlayıp " + yeniSaat + ":" +
                yeniDakika + "'da bitecektir.");

        Concatination yaparken boşluklara dikkat edip gerekli yerlere noktalama işaretleri ekleriz.

         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Sınavın adını giriniz");
        String examName = sc.next();
        System.out.println("Sınav başlangıç saatini tam sayı olarak giriniz");
        int startHour = sc.nextInt();
        System.out.println("Sinav başlangıç dakikasını tamsayı olarak giriniz");
        int startmin = sc.nextInt();
        System.out.println("Sınav süresini tamsayı olarak giriniz");
        int time = sc.nextInt();

        int sureninTamamı = ((startHour*60)+startmin)+time;
        int yeniSaat = sureninTamamı/60;
        int yeniDakika = sureninTamamı%60;

        System.out.println(examName + " sınavı " + startHour + ":" + startmin + "'da başlayıp " + yeniSaat + ":" +
                yeniDakika + "'da bitecektir.");
    }
}
