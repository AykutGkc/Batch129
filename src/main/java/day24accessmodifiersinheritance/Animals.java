package day24accessmodifiersinheritance;

public class Animals {

    /*

    Inheritance'nin faydalari:

    1)Code standardında tekrar iyi değildir.
    2)Code değişime açık olmalıdır.Hatayı düzeltmek kolay olmalı
    3)Gelişime update'e açık olmalıdır
    4)Code atomic yapıda olmalı.

    NOTE 1:parent class(super class) ortak özellikleri icerir.-child class(sub class)  ise Classa özel özellikleri icerir.
    NOTE 2:Bir parent class'a bağlı child class'ı belirtmek için "extends" keyword kullanırız.
    NOTE 3:public methodlar child classlar tarafindan kullanilabilir
           child classlar tarafindan kullanilabilir demek "inherit edilebilir"demektir.
    NOTE 4: protected methodlar inherit edilebilir.
            Cünkü "protected" olan method ve variablelar childlar tarafindan kullanilabilir.
    NOTE 5: "Default" methodlar obje ile ayni package de oldugu sürece "inherit edilebilirler"
            Ama default method ile objectin üretildigi class farkli packagelerde ise "inherit edilemezler"
    Note 6: "private methodlar" inherit edilemezler.
    NOTE 7: Java birden fazla parent'i(Multiple inheritance Java tarafindan desteklenmez) onaylamaz.
    NOTE 8: Child --> parent --> grandparent  --> grandgrandparent... seklinde ilerleyen inheritance'lara "Multi Level Inheritance" denir.
    NOTE 9: Java da "Object Class" tüm java classlarinin ortak parent'edir.
    NOTE 10: Java da "Object Class" haric tüm classlarin parent'i vardir.
    NOTE 11: Java da "Parent"dan "child"a olan iliskilere "HAS-A" relationship denir.
             Java da "Chil"dan "Parent"a olan iliskilere "IS-A" relationship denir.
    NOTE 12: Java da her classin bir tane default constructor'i vardir.
             Bu default constructor classin icinde gözükmez cünkü default constructor object class icindedir.
             Bizim classimiz default constructora ihtiyac duydugunda parent olan object classa gider ve oradaki constructori kullanir.
     */




    protected void eat (){
        System.out.println("Animals eat...");
    }

    public void drink (){
        System.out.println("Animals drink...");
    }


}
