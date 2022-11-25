package Hafta3.exercises;

import java.util.Scanner;

public class scannerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("MT1 notunuzu giriniz");
        int MT1 = sc.nextInt();

        System.out.println("MT2 notunuzu giriniz");
        int MT2 = sc.nextInt();

        System.out.println("Final notunuzu giriniz");
        int fin = sc.nextInt();

        double avg = (MT1*0.3)+(MT2*0.3)+(fin*0.4);

        if (avg<60) {
            System.out.println("\n" + "Dönem ortalamanız: " + avg + "\n" + "Kaldınız");
        } else
            System.out.println("\n" + "Dönem ortalamanız: " + avg + "\n" +"Geçtiniz");
       // System.out.println("Dönem ortalamanız: " + ((MT1*0.3)+(MT2*0.3)+(fin*0.4)));

    }
}
