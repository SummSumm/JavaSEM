package Hafta3.ders;

import javax.swing.*;

public class joptionPane {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Merhaba Java");

        JOptionPane.showMessageDialog(null, "Boku yedin", "NAH", JOptionPane.OK_OPTION);

       // String veri= JOptionPane.showInputDialog("Bir veri giriniz:");

        String veri = JOptionPane.showInputDialog("Bir sayı giriniz");
        int sayi = Integer.parseInt(veri); /* Tip dönüştürme yapılıyor */
        JOptionPane.showMessageDialog(null, "Girilen sayının karesi: " + sayi * sayi);

        String data = JOptionPane.showInputDialog("Lütfen dikdörtgenin kısa kenarını girin");
        int kk = Integer.parseInt(data);
        data = JOptionPane.showInputDialog("Lütfen dikdörtgenin uzun kenarını girin");
        int uk = Integer.parseInt(data);

        JOptionPane.showMessageDialog(null, "Dikdörtgenin karesi= " + (kk*uk));

    }

}
