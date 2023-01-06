package day20passbyvalueoverloading;

public class C02_PassByValue02 {
    public static void main(String[] args) {

        /*

    Gomlek            = 100 TL
    Ogrenci           = -10 TL indirim =90 TL
    Gazi              = -20 TL indirim =80 TL
    Yaslilara         = -5  tL indirim =95 TL

       */

        int gömlek = 100;

        System.out.println("indirim(\"Ögrenci\", gömlek) = " + indirim("Ögrenci", gömlek));
        System.out.println("indirim(\"Gazi\", gömlek) = " + indirim("Gazi", gömlek));
        System.out.println("indirim(\"Yaslilar\", gömlek) = " + indirim("Yaslilar", gömlek));


        String kutlama="Woow";
        System.out.println("kutlama = " + kutlama);
        //kutlamaÜnlemIle(kutlama);
        //System.out.println("(Ünlemden sonra) kutlama = " + kutlama);

        kutlama=kutlamaÜnlemIle(kutlama);
        System.out.println("Methodan sonra atama yapilinca main icinde kutlama = " + kutlama);


    }//Main

    private static String kutlamaÜnlemIle(String kutlama) {
        String ünlemliKutlama=kutlama+"!";
        System.out.println("method icinde kutlama = " + kutlama);
        return ünlemliKutlama;

    }

    private static int indirim(String durum, int gömlek) {

        switch (durum) {
            case "Ögrenci":
                gömlek = gömlek - 10;
                break;
            case "Gazi":
                gömlek = gömlek - 20;
                break;
            case "Yaslilar":
                gömlek = gömlek - 5;
                break;
            default:
                gömlek=gömlek;
        }
        return gömlek;
    }


}//Class
