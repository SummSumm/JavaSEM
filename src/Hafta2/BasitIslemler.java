package Hafta2;

public class BasitIslemler {
    public static void main(String[] args) {
        System.out.println("İşlemin sonucu " + (3 + 5));

        int num1 = 2;
        int num2 = 5;

        System.out.println("İşlemin sonucu " + (num1 + num2));
        // yeniden atama
        num2++;
        System.out.println(num2);
        num2 = 35;
        System.out.println(num2);

        System.out.println("-------------------------------------");

        double hesap = 125.36;
        hesap += 1500;
        System.out.println("hesap = " + hesap);
        double para = 650;
        hesap -= para;
        System.out.println("hesap = " + hesap);

        hesap*=2;
        hesap/=3;

hesap +=1;



    }
}
