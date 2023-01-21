package day30excaptionsinterface;


    /*
    1)Bir interface'i bir classin parenti yapmak icin "implements" keywordunu kullaniniz.
    2)Java parentlar class oldugunda multiple parenta müsade etmez ama biz bazen multiple parenta ihtiyac duyariz.
      Bu ihtiyaci gidermek icin java "interface" isimli yeni bir yapi olusturdu. Bu yapi sayesinde bir Class icin coklu interface parent olusturabiliriz.
    3)Coklu interface parentlarin her birinin icine ayni isimli methodlar koyabiliriz.
      Mesela Ac'nin, Engine'nin ve security'nin her birinin iclerine run methodu koymak gibi.
      Child class herhangibirini override ettiginde hepsini override etmis gibi olur sonrada bodyi Child classta yazarak uygulamasini yapmis olur.
    */


public class Civic implements AC,Engine,Security {

    @Override
    public void cool() {
        System.out.println("Civic cools perfectly");
    }

    @Override
    public void run() {
        System.out.println("Ac runs perfectly");
    }
}
