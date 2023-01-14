package day26overriding;

public class Animal {

    /*
        1)Parent Class'daki method'u Child Class icinde ozellestirerek kullanmaya "Overriding " yapmak denir.
        2)Overriding 'de method'un parantezine, method'un ismine dokunulmaz, method'un body'si degistirilir.
        3)Override ==> Override annotation :Override kurallarinin Java tarafindan kontrol edilmesini saglar.
        4)Overriding 'de parent Class'daki method'a "Overridden Method", child class'daki method'a ise "Overriding Method" denir.
        5)"Private" methodlar "override" edilemezler.
        6)Child class daki override edilmis method(Overridding method)'un Access modifier'i parent classdaki
           override edilmis method(overridden method)ùn access modifierdan dar olamaz.
           Overridden Method==> Protected ise Overriding Method==> protected + public
           Overridden Method==> default ise Overriding Method==> default + protected + public
        7)Child classda override edilen methodun(overriding method) retun type'i methodun retrun ettiigi data type'inin aynisi veya
          data type'inin parent'i olarak secilir.
        8)8)Method'un return type'i "primitive" ise, Overriding yaparken return type degistirilemez. Cunku return type ya
          ayni olur ya da parent'dan secilir ama primitive'ler arasinda parent-child iliskisi olmadigindan parent'dan secmek
          mevzu olamaz. O zaman tek secenek aynisi olmalidir kalir.
        9)Method'un return type'i "Wrapper Class" ise, Overriding yaparken return type degistirilemez. Cunku; return type ya ayni olur veya parent'dan secilir,
          ama Java bir wrapper class'i digerinin parent'i yapmadigindan parent'dan secme ihtimali yoktur, geriye sadece aynisi olma ihtimali kalir
       10)Method'un return type'i "void" ise Overriding yaparken return type degistirilemez.
     */



    public void eat (){ //parentta ki override edilmis eat() metoduna" overridden method" denir.
        System.out.println("Animals eat...");
    }
    public void drink (){
        System.out.println("Animals drink...");
    }

    public Animal create (){
        return new Animal();
    }

    public int add(int a,int b){
        return a+b;
    }

    public Integer multiply(int a,int b){
        return a*b;
    }

}
