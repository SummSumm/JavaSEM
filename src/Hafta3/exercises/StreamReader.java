package Hafta3.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamReader {
    public static void main(String[] args) throws IOException {
/*
1- Bir öğrencinin birinci ara sınav, ikinci ara sınav ve final sınavı notlarını klavyeden okuyan ve
sonra bu sınavların (aynı sıra ile) %30, %30 ve %40 ağırlıklarına göre ortalamasını bulup, ekrana yazan
bir Java programı yazınız. Girilen verileri okumak için BufferedReader sınıfını kullanınız.
 */
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));

        String MT1, MT2, fin;

        System.out.print("MT1 notunuzu giriniz: ");
        MT1 = reader.readLine();
        int MT1i = Integer.parseInt(MT1);

        System.out.print("MT2 notunuzu giriniz: ");
        MT2 = reader.readLine();
        int MT2i = Integer.parseInt(MT2);

        System.out.print("Final notunuzu giriniz: ");
        fin = reader.readLine();
        int fini = Integer.parseInt(fin);

        double avg = (MT1i*0.3) + (MT2i*0.3) + (fini*0.4);
        System.out.println("Dönem ortalamanız: " + avg);
    }
}
