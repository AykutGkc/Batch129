package practice.Regularjavapractice.practiceday06_031223;

public class C04_Varargs02 {
    public static void main(String[] args) {

        //Verilen sayilardan ilki haric tüm sayilari toplayip ilk sayi ile carpan bir method olusturunuz.
        int sayi1=5;
        int sayi2=7;
        int sayi3=2;
        int sayi4=4;
        int sayi5=9;

        sonuc(sayi1,sayi2,sayi3,sayi4,sayi5);


    }//MAin

    private static void sonuc(int carpilacakSayi, int... toplanacakSayi) {
        int toplam=0;
        for (int w : toplanacakSayi) {
            toplam+=w;
        }
        int sonuc=toplam*carpilacakSayi;
        System.out.println("sonuc = " + sonuc);


    }//Method
}//Class
