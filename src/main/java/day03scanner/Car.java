package day03scanner;

public class Car {

    //Class ==> Variable (Pasif özellikler) ==> Object
            //==> Method (Aktif Özellikler)

    public String model= "Corolla"; //Pasif özellikler Variabler
    public int fiyat= 200000;

    public static void main(String[] args) {

        //Class ismini yaziniz => objezye isim verin  =   new keyboardunu kullan => class ismini parantez ile kullan (contructor)
                  Car                myCorolla        =     new                         Car() ;
        System.out.println(myCorolla.fiyat);
        System.out.println(myCorolla.model);
        myCorolla.hareket();
        myCorolla.dur();


    }//Main'in bodysi

    public void hareket (){ //Aktif özellikler methodlar
        System.out.println("Toyota hizli hareket eder");
    }
    public void dur (){//Aktif özellikler methodlar
        System.out.println("Toyota Güvenli durur");
    }

}//Class bodysi
