package Ödevler;

public class Ödev1 {
    public static void main(String[] args) {
          /*
        1. Kullanıcıdan sınav adı istenir
        String examName = "...";
        2. Kullanıcıdan sınav başlangıcının saati tamsayı olarak istenir
        int starthour = ...;
        3. Kullanıcıdan sınav başlangıcının dakikası tamsayı olarak istenir
        int startmin = ...;
        4. Kullanıcıdan sınav suresi toplam dakika olarak tamsayı olarak istenir
        int time = ...;
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

        String examName = "EPE";
        int startHour = 10;
        int startmin = 50;
        int time = 200;

        int sureninTamamı = ((startHour*60)+startmin)+time;
        int yeniSaat = sureninTamamı/60;
        int yeniDakika = sureninTamamı%60;

        System.out.println(examName + " sınavı " + startHour + ":" + startmin + "'da başlayıp " + yeniSaat + ":" +
                yeniDakika + "'da bitecektir.");
    }
}
