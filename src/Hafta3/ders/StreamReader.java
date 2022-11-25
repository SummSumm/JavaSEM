package Hafta3.ders;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamReader {
    // Bu konsol uygulama programı, iki tam sayıyı klavyeden okur ve
// bu iki sayının toplamını ve birinci ile ikinci sayı arasındaki
// farkı bularak ekrana bastırır.

    public static void main(String args[]) throws IOException {
        String s; // okunan dizgi
        int i1, i2; // okunan tam sayılar
        int sum, diff; // toplam ve fark
        // Klavye ile özdeşleşen System.in akışını kullanarak
        // BufferedReader nesnesini yarat
        BufferedReader read1 = new BufferedReader(new InputStreamReader(System.in));
        // İlk tam sayıyı oku
        System.out.print("Birinci tam sayı: ");
        s = read1.readLine();
        i1 = Integer.parseInt(s);
        // İkinci tam sayıyı oku
        System.out.print("İkinci tam sayı: ");
        s = read1.readLine();
        i2 = Integer.parseInt(s);
        // Toplamı bul
        sum = i1 + i2;
        // Farkı bul
        diff = i1 - i2;
        // Toplamı ve farkı ekrana yazdır
        System.out.println("Toplam: " + sum);
        System.out.println("Fark : " + diff);
    }
}

