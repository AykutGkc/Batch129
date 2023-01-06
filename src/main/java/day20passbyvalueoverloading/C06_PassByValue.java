package day20passbyvalueoverloading;

public class C06_PassByValue {
    public static void main(String[] args) {

      // 100 tl ye satilan bir urun icin 2 farkli indirim uygulayan bir method olusturunuz
        int fiyat=100;

        indirimYap25(fiyat);
        System.out.println("main icinde methodtan sonra fiyat = " + fiyat);

        System.out.println(" main icinde methoddan sonra indirimYap10(fiyat) = " + indirimYap10(fiyat));

    }//Main

    private static int indirimYap10(int fiyat) {
        return fiyat*=0.90;
    }

    private static void indirimYap25(int fiyat) {

        fiyat*=0.75;
        System.out.println("%25 indirimli fiyat: " + fiyat ); //75

    }//Method
}//class
