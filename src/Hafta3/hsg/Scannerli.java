package Hafta3.hsg;

import java.util.Scanner;

public class Scannerli {
    public static void main(String[] args) {
        Scanner hsg = new Scanner(System.in);
        int sin1, sin2, fin;
        double Sonuc;
        System.out.println("I.sınav notunuzu giriniz");
        sin1= hsg.nextInt();
        System.out.println("II.sınav notunuzu giriniz");
        sin2= hsg.nextInt();
        System.out.println("Final notunuzu giriniz");
        fin= hsg.nextInt();
        Sonuc= (sin1*0.3) + (sin2*0.3) + (fin*0.4);
        System.out.println("Dönem ortalamanız = " + Sonuc);
    }
}
