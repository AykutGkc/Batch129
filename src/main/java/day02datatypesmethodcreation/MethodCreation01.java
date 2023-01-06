package day02datatypesmethodcreation;

public class MethodCreation01 {
    public static void main(String[] args) {

        /*

        Java da method nasil olusturulur??
        1) Main methodun disinda olusturulur.
        2) Access Modifier + Return Type + Method ismi + ()

        Olusturulan methodlar nasil kullanilir?
        1)Main methodun icinden kullanilir.
        2)Methodun ismini + () yazin
        3) islem yapacaginiz sayilari parantez icine koyunuz.
         */

        int sonuc = add(3,5);
        System.out.println(sonuc);

        long carpmaSonucu = multiply(9,9) ;
        System.out.println(carpmaSonucu);

        int numberSonuc = number3(2,3,4);
        System.out.println(numberSonuc);

        double kup = getCube(5);
        System.out.println(kup);

        int areaOfResult = areaOfDikdörtgen(4,5);
        System.out.println(areaOfResult);

        double cevreDikdörtgenSonuc = cevreDikdörtgen(3.4,4.3);
        System.out.println(cevreDikdörtgenSonuc);

        double cevreDaireSonuc = cevreDaire(3);
        System.out.println(cevreDaireSonuc);

        double alanDaireSonuc = alanDaire(2);
        System.out.println(alanDaireSonuc);

    }

    public static int add (int a,int b) {
        return a+b ;}

    protected static long multiply (int a, int b) {
        return a*b;
    }

    //Verilen 3 sayidan ilk ikisini carpan ve sonucu toplayan methodu olusturunuz ve kullaniniz.

    private static int number3 (int a, int b, int c){
        return a*b+c ;}

    //Verilen bir ondalik sayinin küpünü hesaplayan methodu olusturup kullanin.
    // Access modifier'i default yapmak icin access modifier yazmayiniz.
    static double getCube (double a) {
        return a*a*a ; }

     //Ödevler;
    //1)Dikdirtgenin alanini hesaplayan methodu olusturunuz ve kullaniniz
    public static int areaOfDikdörtgen (int a, int b) {
        return a*b ;
    }

    //Ödev 2)Dikdirtgenin cevresini hesaplayan methodu olusturunuz ve kullaniniz.
    public static double cevreDikdörtgen (double a, double b) {
        return 2*(a+b) ;
    }
    //ödev 3)Dairenin cevresini hesaplayan methodu olusturunuz ve kullaniniz
    public static double cevreDaire (double a){
        return 2*a*3.14 ;
    }
    //Ödev 4)Dairenin alaninio hesaplayan methodu olusturunuz ve kullaniniz
    public static double alanDaire (double a) {
        return 3.14*a*a;
    }



    }






