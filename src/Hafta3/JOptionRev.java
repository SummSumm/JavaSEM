package Hafta3;

import javax.swing.*;

public class JOptionRev {
    public static void main(String[] args) {
        //Nesne yok
        // String - Donustur
        // mesaj paneli   vs. input paneli


        JOptionPane.showMessageDialog(null, "Naber");
        JOptionPane.showMessageDialog(null, "Naber", "Hatır sorma", JOptionPane.OK_OPTION);
        JOptionPane.showMessageDialog(null, "Naber", "Hatır sorma", JOptionPane.WARNING_MESSAGE);

        String veri = JOptionPane.showInputDialog("Doğdugunuz yılı giriniz"); // string veri geleceği için String variablea ata
        int yil = Integer.parseInt(veri);

       JOptionPane.showMessageDialog(null, "Yaşınız = " + (2022-yil));
        System.out.println("Yaşınız = " + (2022-yil));


    }
}
