package Hafta3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferRev {
    public static void main(String[] args) throws IOException {
        // BUFFERED READER (Obje + String)

        // Önce OBJE oluştur
        // - sorunu sor
        // Obje üzerinden bilgiyi al --> STRING OLARAK ALIR
        // Gerekiyorsa dönüştür
        // kullan

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Doğdugunuz yılı giriniz");
        String yil= buff.readLine();
        int yılInt = Integer.parseInt(yil);

        System.out.println("Yaşınız = " + (2022-yılInt));


    }
}
