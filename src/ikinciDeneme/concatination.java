package ikinciDeneme;

public class concatination {
    public static void main(String[] args) {
        String str = "hello";
        String str2 = "world";


        System.out.println(str);
        System.out.println("Merhaba");
        System.out.println("En sevdiğim kelime " + str);
        System.out.println("En sevdiğim kelime " + str + "dur.");
        System.out.println("En sevdiğim kelime " + str + "dur.");
        System.out.println("---------------------------------------------------------");

        String isim = "Mehmet Küçük";
        String cumle  =" kişisinin davası açılmış olup gerekli işlemler yapılmıştır.";

        System.out.println(isim + cumle);
        System.out.println("---------------------------------------------------------");

        int kitapSay = 15;
        System.out.println("Kütüphanemde " + kitapSay + " kitap vardır.");
        System.out.println("Kütüphanemde " + kitapSay+5 + " kitap vardır.");
        System.out.println("Kütüphanemde " + (kitapSay+5) + " kitap vardır.");
        System.out.println("Kütüphanemde " + "kitapSay" + " kitap vardır.");
        System.out.println("Kütüphanemde " + "15" + " kitap vardır.");
        System.out.println(kitapSay+5);

        System.out.println("---------------------------------------------------------");
        //sout
        String a = "Hello bitch";
        System.out.println(a);

        //soutv
        String esiminAdi = "Bugra";
        System.out.println("esiminAdi = " + esiminAdi);

        System.out.println("---------------------------------------------------------");


    }
}
