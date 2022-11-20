package JavaProject;

public class tamBolenler {
    public static void main(String[] args) {
        // 12nin kaç böleni vardır
        int sayi = 12;
        int count = 0;

        for (int bolen = 1; bolen <= sayi; bolen++) {
            if (sayi % bolen == 0) {
            //System.out.print(i + " ");
            count++;
            }
        }
        System.out.println(" ");
        System.out.println("count = " + count);

        System.out.println("------------------------------------------------------");


    }
}

