package Hafta3.hsg;

import javax.swing.*;
import java.lang.module.FindException;

public class jOptioli {
    public static void main(String[] args) {

        String veri;
        int sin1, sin2, fin;
        double sonuc;
        veri = JOptionPane.showInputDialog("I.sınav notunuzu girin");
        sin1 = Integer.parseInt(veri);
        veri = JOptionPane.showInputDialog("II.sınav notunuzu girin");
        sin2 = Integer.parseInt(veri);
        veri = JOptionPane.showInputDialog("Final notunuzu girin");
        fin = Integer.parseInt(veri);
        sonuc = (sin1*0.3) + (sin2*0.3) + (fin*0.4);
        JOptionPane.showMessageDialog(null, "Dönem sonu ortalaması = " + sonuc);
    }
}
