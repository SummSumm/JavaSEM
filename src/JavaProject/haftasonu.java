package JavaProject;

public class haftasonu {
    public static void main(String[] args) {
        // değişkenin türü + değişkenin adı + değişkenin içeriği
        //TAMSAYILAR
        byte b = 17;
        short s = 15;
        int i = 450;
        long l = 150;

        //REEL SAYILAR
        float f = 125.6F;
        double d = 65.8;

        // Tamsayı işlem : int
        // reel işlem: double

        //işlemin int çıkacağını biliyorum (b+5), ama sen bunu yine de bytea çevir (byte)
        byte toplam = (byte)(b + 5);

        //intelliJ'de printin kolayı: sout
        //println -> sonuna enter atar; print sonuna enter atmaz, yanından boşluksuz devam eder
        System.out.println(toplam);
        System.out.println(toplam);

        //short
        short cikar = (short)(s - 10);
        System.out.println(cikar);

        //int
        int hello = i+9;
        System.out.println(hello);

        //long
        //long int'ten buyuk oldugu için dönüştürmeye gerek yok
        long işlem = l*2;
        System.out.println(işlem);

        float işlem3 = (float)(f+0.5);
        System.out.println(işlem3);

        double işlem4 = i+d;
        System.out.println(işlem4);

        //1. tam sayılı işlemler INT + reel işlemler DOUBLE
        //2. küçük bytelı işlem büyükle yapılmaz: donulturme gerekir --> (byte)(işlem)
        //3. buyuk bytelı işlemin içine kucuk byte konabilir, donuşturmeye gerek kalmaz

        System.out.println(işlem4 + (687*2));


    }

}
