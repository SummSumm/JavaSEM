package Hafta3.exercises;

import javax.swing.*;

public class jOptionPane {
    public static void main(String[] args) {

        String MT1 = JOptionPane.showInputDialog("MT1 notunuzu giriniz");
        int MT1not = Integer.parseInt(MT1); /* Tip dönüştürme yapılıyor */

        String MT2 = JOptionPane.showInputDialog("MT2 notunuzu giriniz");
        int MT2not = Integer.parseInt(MT2); /* Tip dönüştürme yapılıyor */

        String fin = JOptionPane.showInputDialog("Final notunuzu giriniz");
        int finnot = Integer.parseInt(fin); /* Tip dönüştürme yapılıyor */


        JOptionPane.showMessageDialog(null, "Dönem ortalamanız: " +
                ((MT1not*0.3) + (MT2not*0.3) + (finnot*0.4)));
    }
}
