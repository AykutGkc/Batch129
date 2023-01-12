package practice.Regularjavapractice.practiceday07_070122;

public class Bütce {

    //Tüm aile üyelerinin birikimlerinin bulundugu ortak ihtiyaclar icin
    //Kullanildigi bir bütce ile kisisel harcamalarin yapildigi
    //harcliklarin oldugu basit bir ev bütcesi kodu yaziniz.

    public static int bütce;
    public int harclik;

    public void harclikAl(int alinanHarclik){
        bütce-=alinanHarclik; //ortak hesaptan aliniyor.
        harclik+=alinanHarclik;
    }

    public void butcedenHarca (int harcanacakPara){
        bütce-=harcanacakPara;
    }

    public void harclikHarca(int harclikHarcamasi ){
        harclik-=harclikHarcamasi;

    }

    public void maasAl(int alinanMaas){
        bütce+=alinanMaas;
    }


}
