package day25inheritance;

public class Vehicle {
     /*
    1)Child classtan bir object olusturdugunuz da Constructorlar en üstteki
      parent classtan baslatilarak alta dogru calistirilir.
    2)Child classta ki constructordan parent classdaki constructora gidebilmek icin "super()" kullanilir.
    3)Parent classta birden fazla constructor varsa istenilen constructor, super() ifadesinin parantezi icine yazilan parametreler yardimi ile secilebilir.
    4)Ayni class icindeki constructorlari secmek icin "this()" kullanilir.
      Ayni classda birden fazla constructor varsa istenilen constructor, ""this()"" ifadesinin parantezi icine yazilan parametreler yardimi ile secilebilir.
    5)"super()" ifadesini yazmak istege baglidir,yazmasaniz da Java sanki super() varmis gibi davranit.
       Ama kodunuzu daha okunabilir kilmak icin yazmaniz tavsiye edilir.
    6)"super()" ve "this()" ifadeleri constructor icinde her zaman ilk satirda olmali.
    7) Bir constructor icinde super() ve this() ifadeleri sadece bir kez kullanilit. (Bknz.6)
    8) Inheritance da variableari ve methodlari cagirmak icin "this" veya "super" kullanilir.
        "this" ayni class icinde ki variablari ve methodlari cagirmak icin kullanilir.
        "super" parent class icinde ki variablari ve methodlari cagirmak icin kullanilir.
    9) Inharitance da object kullanarak variable cagirsaniz, object'in data type'ini temsil eden classdan variable'i aramaya baslayiniz.
       O classta yoksa parentlere bakiniz.
    10) Inharitance da object kullanarak method cagirsaniz, object'in constructorini temsil eden classdan methodu'u aramaya baslayiniz.
       O classta yoksa parentlere bakiniz.

       OOP Principals:
        i)Inheritance
        ii)Polymorphism: Method Overloading + Method Overriding
        iii)Encapsulation
        iv)Abstraction


     */

    public int price=12000;

    public void engine(){
        System.out.println("Vehicle engine...");
    }

    public Vehicle(){
        System.out.println("Vehicle 1");
    }

    public Vehicle(int price){
        System.out.println("Vehicle 2 : " + price );
    }






}//class
