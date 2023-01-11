package practice.Advancejavapractice.practiceday07_100123;

import java.time.LocalDate;
import java.time.LocalTime;

public class Market {

    String urunAdi;
    double urunFiyati;
    String sonKullanmaTarihi;

    public Market(String urunAdi, double urunFiyati, int aySonra) {
        this.urunAdi = urunAdi;

        if (urunFiyati>99){
            urunFiyati=urunFiyati*0.9;
        }

        this.urunFiyati = urunFiyati;
        this.sonKullanmaTarihi = LocalDate.now().plusMonths(aySonra).toString();
    }

    public Market(String urunAdi, double urunFiyati ) {
        this.urunAdi = urunAdi;

        if (urunFiyati>99){
            urunFiyati=urunFiyati*0.9;
        }

        this.urunFiyati = urunFiyati;
        this.sonKullanmaTarihi = "Ürünün son kullanma tarihi bulunmamaktadir";
    }

    Market(){

    }


    @Override
    public String toString() {
        return "Market{" +
                "urunAdi='" + urunAdi + '\'' +
                ", urunFiyati=" + urunFiyati +
                ", sonKullanmaTarihi='" + sonKullanmaTarihi + '\'' +
                '}';
    }
}
