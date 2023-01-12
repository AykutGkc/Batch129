package practice.Regularjavapractice.practiceday07_070122;

public class HacimRunner {
    public static void main(String[] args) {

        //KÜp,Kareprizma ve dikdörtgenler prizmasinin hacmini hesaplayan method olusturunuz.

        Hacim hacim = new Hacim(); //Obje olusturuldu

        int karePrizma=hacim.hacimHesapla(5,6);
        int dikdörtgenPrizma=hacim.hacimHesapla(5,6,7);
        int küpPrizma=hacim.hacimHesapla(5);

        System.out.println("karePrizma = " + karePrizma);
        System.out.println("dikdörtgenPrizma = " + dikdörtgenPrizma);
        System.out.println("küpPrizma = " + küpPrizma);







    }//Main
}//Class
