package Hafta3.hsg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamReaderli {
    public static void main(String[] args) throws IOException {

        String s;
        int sin1, sin2, fin;
        double sonuc;

        BufferedReader abc = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("1. arasınav notunuzu giriniz: ");
        s= abc.readLine();
        sin1 = Integer.parseInt(s);

        System.out.println("2. arasınav notunuzu giriniz: ");
        s= abc.readLine();
        sin2 = Integer.parseInt(s);

        System.out.println("Final notunuzu giriniz: ");
        s= abc.readLine();
        fin = Integer.parseInt(s);

        sonuc= (sin1*0.3) + (sin2*0.3) + (fin*0.4);
        System.out.println("Yıl Ortalamanız = " + sonuc);



    }
}


/*
1- Bir öğrencinin birinci ara sınav, ikinci ara sınav ve final sınavı notlarını klavyeden okuyan ve
sonra bu sınavların (aynı sıra ile) %30, %30 ve %40 ağırlıklarına göre ortalamasını bulup,
ekrana yazan bir Java programı yazınız. Girilen verileri okumak için BufferedReader sınıfını kullanınız.
 */