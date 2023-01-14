package practice.Advancejavapractice.practiceday08_140123;

public class Kütüphane {
    //Kütüphaneye eklemek istediğiniz kitapları, adı, yazar adı, sayfa sayısı, seri numarası ile yazdıran bir kod yazınız.

    String kitapAdi;
    String yazarAdi;
    int sayfaSayisi;
    String seriNumarasi;
    static int kitapSayisi;

    public Kütüphane(String kitapAdi, String yazarAdi, int sayfaSayisi) {
        kitapSayisi++;
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.sayfaSayisi = sayfaSayisi;
        seriNumarasi=kitapAdi.substring(0,2)+yazarAdi.substring(0,2)+kitapSayisi;
        kitapBilgileri();

    }

   public void kitapBilgileri(){
       System.out.println("Kitap Adi: " + kitapAdi+ "\nYazar adi: " + yazarAdi+"\nSayfa sayisi: " + sayfaSayisi + "\nSeri Numarasi: " + seriNumarasi);
       System.out.println("=====================");
   }
}
