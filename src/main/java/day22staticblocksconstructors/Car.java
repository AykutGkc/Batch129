package day22staticblocksconstructors;


/*
        Constructor nedir?
        Class'Dan obje üretmemize yarayan code block'laridir.

        Class olusturdugumuzda Java bize otomatik olarak bir constructor verir.
        Ama bu constructor gözle görülmez, gözle görülmeyen otomatik olarak java tarafindan verilen bu constructorlara
        "default" constructor denir.

        "Default constructorlar" "Car(){}" seklindedir.

        Siz kendi constructorinizi olusturdugunuzda java default constructori siler.

        Bir Class'da farkli parametreler kullanarak istediginiz kadar constructor olusturabilirsiniz.

        Farkli constructerlar sayesinde bir classtan farkli farkli objeler olusturabiliriz.

        Interview sorusu: Method ile constructorin farki var midir? Varsa nedir?
        Cevap:            Method ile constructar farkli yapilardir
                           i)Methodlarda return type vardir ama constructorlar da yoktur
                           ii)Methodlarin ismi yaptiklara ise göre developerlar tarafindan belirlenir.
                              Constructorlarin ismi ise her zaman class ismi ile ayni olmalidir.

        */


public class Car {


       String make="Honda";
       String model="Accord";
       int year=2023;
       boolean hybrid=true;

       Car(String make, String model, int year, boolean hybrid){

              this.make=make;
              this.model=model;
              this.year=year;
              this.hybrid=hybrid;
       }


       Car (String make, String model){
              this.make=make;
              this.model=model;
              if(year==2023){
                     this.year=0;
              }
              if(hybrid==true){
                     this.hybrid=false;
              }

       }

       public Car(String make, int year) {
              this.make = make;
              this.year = year;
       }



       @Override
       public String toString() {
              return "Car{" +
                      "make='" + make + '\'' +
                      ", model='" + model + '\'' +
                      ", year=" + year +
                      ", hybrid=" + hybrid +
                      '}';
       }
}//Class
