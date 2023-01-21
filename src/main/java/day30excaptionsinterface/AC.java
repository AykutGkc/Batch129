package day30excaptionsinterface;

public interface AC {

    //interfacelerin icine "concrete method" konulamaz.
    // Cünkü concret methodlarda body vardir ve body o methodun o isi nasil yapacagini belirtir.
    //Isin nasil yapilacagi bir cok detay belirtir.
    //ve bu child classlarda kafa karisikligina sebeb olur.
    //Halbuki sadece yapilmasi gereken isi söyleyip nasil yapilacagini childa birakirsaniz
    //child classin kafa karisikligini engellemis olursunuz.

    //Interfaceler "concrete" method icermezler, dolayisiyla interfacein icinde ki hicbitr sey istege bagli degildir.
    //her sey Child classlar icin mecburidir.
    //Bu yüzden interfacelere "to-do list"de denir.

    //Interfacelerde ki tüm methodlar otomatik olarak "public"tir, "abstract"tir, "static" degildir.

    //Interfacelerde ki variablar otomatik olarak "public"tir, "static"tir, "final"dir.

    void cool();
    void run();

    int price= 2000;
    String model="Mitsubishi";

}
