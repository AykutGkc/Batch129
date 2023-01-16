package day27encapsulationabstraction;

public abstract class Courses {

    /*
    1)Bazen metod body'sini yazmak gerekmez, bu durumlarda body'siz method olusturmak gerekir.
      Body'Si olmayan methodlara "abstract method" lar denir.

    2)"Abstract method"lar child classlar tarafindan "override" edilmek zorundadir.
      Bu yüzden eger bir fonksiyonun chil classlar tarafindan kullanilmasini mecbur kilmak isterseniz
      o methodu abstract yapmak gerekir.

    3) Bir methodun bodysini silmek o method abstract olmasi icin yeterli degildir.
       "access modifier" ile "return type" arasina "abstract" keyword koymak gerekir

    4)"Abstract method"lar siradan classlarin(concrete) icine yazilamazlar, "Abstract method"larin icine yazildiklari
       classlar abstract olmak zorundadir.

     5)"Abstract classlarda" hem "abstract methodlar" hem de "concrete methodlar" kullanilabilir.

     6)"Concrete classlar" "abstract classlarin" childi olabilirler.
        "abstract methodlarin" override edilme zorunlulugu "Concrete classlar" icindir.

     */


    public abstract void math();

    public void art(){
        System.out.println("Painting");
    }

    //final methodlar override edilemezler, halbuki abstract methodlar override edilmek icin olustururlar.
    //Bu celiskidir. Bu yüzden java abstract methodlarin final olmasina müsade etmez.
    //public final abstract void science();

    //Concrete classlar final oldugunda child classa sahip olamazlar.
    //Ama "Abstract Classlar" icin Child class olmalidir cünkü child classlar abstract parent classdaki abstract
    //methodlari kullanirlar. Bu yüzden Java abstract classlarin "final" olmasina müsade etmez.

    //Abstract methodlar "private" olamazlar, cünkü child classlar abstract methodlari kullanirlar, private yapinca
    //kullanima kapali olur.Bu celiskidir, bu yüzden java abstaract methodin "private olmasina müsade etmez.

    //"abstract methodlar" static olamazlar, cünkü  "static methodlar" override edilemezler, halbu ki abstract
    // methodlar override edilmek icin olusturulmuslardir.






}
