package practice.Advancejavapractice.practiceday11_240123.interface_maas_hesapla;

public class MaasHesapla implements Vergi, MasArtir{
    @Override
    public double yillikEkstra(int calismaYili) {
        return calismaYili*100;
    }

    @Override
    public double saatlikEkstra(int calismaSaati) {
        if (calismaSaati>160){
            return (calismaSaati-160)*10;
        }else {
            return 0;
        }

    }

    @Override
    public double vergi(int calismaYili, double brütMaas) {
        if (calismaYili >= 10) {
            return brütMaas * 0.3;
        } else {
            return brütMaas * 0.2;
        }
    }

    public double netMaas(double brütMaas, int calismaYili, int calismaSaati){
        return brütMaas+yillikEkstra(calismaYili)+saatlikEkstra(calismaSaati)-vergi(calismaYili, brütMaas);
    }

}
