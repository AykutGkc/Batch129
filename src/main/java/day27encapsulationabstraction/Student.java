package day27encapsulationabstraction;

public class Student {

    private String stdId="AC123";
    private double gpa=3.99;
    private boolean poor=true;

                //Encapsulation yapilmis data'yi okuyabilir miyiz?
    //get method'lar(getter) encapsule edilmis (saklanmis) datayi okumamizi saglar.
    //get methodlar(getter) her zaman public olur.
    //get methodlar(getter) return type'i variable'in data type'i ile ayni olur.
    //get methodlar(getter)'in isimleri get+variable name seklinde olur.
    //get methodlar(getter)'in isimleri variable boolean ise is+variable name seklinde olur.
    //get methodlar(getter)'lar parametre kullanmazlar
    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isPoor() {
        return poor;
    }

             //Encapsulation yapilmis datalarin degerini degistirebilir miyiz?
    //set methodlar(setter) encapsule edilmis datalarin degerlerini degistirmemize yarar.
    //set methodlar(setter) her zaman publicolur.
    //set methodlar(setter)'larin return type'i her zaman void olur.
    //set methodlar(setter)'larin isimleri set+variable name seklinde olur.
    ////set methodlar(setter)'lar variablee ile ayni data type'nda parametre kullanir.

    //getter ve setterlarin ikisine birden "Java Beans" denir.
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setPoor(boolean poor) {
        this.poor = poor;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }
}
