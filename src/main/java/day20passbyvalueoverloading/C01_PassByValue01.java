package day20passbyvalueoverloading;

public class C01_PassByValue01 {
    public static void main(String[] args) {

        /*

    Pass By Value:Method'a Value'nun bir kopyasini gonder demektir.

    Bu nedenle Pass by Value 'da orjinal parametre degismez.

    Java Pass  By Value kullanilir,


    1)Java  variable'nin orjinal degerini korumak ister

    2)Java Variable'nin icindeki degeri kopyalar ve methodun icerisine kopya degeri gonderir.

    Deger uzerinde yapilan degisiklikler orjinal parametreyi etkilemez.

    Pass By Referance 'da ise referans kopyalanir ve method da kullanilior.

    Yapilan degisiklik orjinal parametreyi etkiler.

    Bu tarz programlar degeri korumak istiyorsa isi developera birakmistir.

    Kendisi degeri degistirir.

     */

        int gömlek=100;
        System.out.println("gömlek = " + gömlek);//100

        //ögrenciIndirimi(gömlek); //)0
        //System.out.println("gömlek = " + gömlek);//90

        gömlek=ögrenciIndirimi(gömlek);

        System.out.println("Atamadan sonra (main'deki)gömlek = " + gömlek);




    }//Main

    private static int ögrenciIndirimi(int gömlek) {
            int ogrenciGömlegi=gömlek-10;
        System.out.println("ogrenciGömlegi = " + ogrenciGömlegi); //ögrenciGömlegi=90
        return ogrenciGömlegi;
    }//Method

}//class
