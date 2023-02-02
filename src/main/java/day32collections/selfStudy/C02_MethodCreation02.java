package day32collections.selfStudy;

public class C02_MethodCreation02 {

    //ödev 3)Dairenin cevresini hesaplayan methodu olusturunuz ve kullaniniz

    public static void main(String[] args) {

        double sonuc=cevreDAire(3);
        System.out.println(sonuc);
        int sonuc2=(int)sonuc;
        System.out.println(sonuc2);

    }

   static double cevreDAire(double r) {
        return 2*r* Math.PI;
    }
}
