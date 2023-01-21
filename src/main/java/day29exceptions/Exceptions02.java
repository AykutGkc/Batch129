package day29exceptions;

/*
   "throw" ile "throws" keyword'leri arasindaki fark nedir?
        1)"throw" method body'si icinde, "throws" ise method paranetzinden hemen sonra kullanilir.
        2)"throw" method body'si icinde istenilen yerde istenildigi kadar kullanilir,
          "throws" ise method paranetzinden hemen sonra sadece bir kere kullanilabilir.
        3)"throw" dan sonra "new" keyword ve "constructor" kullanilarak object olusturulur.
          "throws" dan sonra sadece Exception Class ismi yazilir
        4)"throw" belli sartlar icin Exception atmada kullanilir, "throws" ise application'i Exception attiktan sonra durdurur.
 */

public class Exceptions02 {
    public static void main(String[] args) throws IllegalArgumentException {
        try{
        printAge(-35);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

//        try {
//            getMark(-1000);
//        }catch(IllegalArgumentException e){
//            System.out.println(e.getMessage());
//        }

    }

    //"throw" bir methodun body icinde istedigimiz yerde, istedigimiz kosullar icin, istedigimiz kadar Exception atmamizi saglar.
    //"thorow" keyword yazildiktan sonra bir Exception Class objecti olusturulur.
    //Exception Class constructorinin parantezinin icine istediginiz Exception Mesaji yazabilirsiniz.
    public static void printAge(int age){
        if (age<10){
            throw new IllegalArgumentException("Age cannot be negative");
        }else {
            System.out.println(age);
        }
    }
    //Ögrenci nitlari girisi yaoan ve notlau consola yazdiran method olusturunuz.
    public static void getMark(double d){
        if(d<0){
            throw new IllegalArgumentException("Marks cannot be than zero");
        }else if (d>100){
            throw new IllegalArgumentException("Marks cannot be greater than 100");
        }else {
            System.out.println(d);
        }
    }
}
