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
    }

}
