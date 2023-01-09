package day23datetimestringbuilder;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class C01_Datetime01 {
    public static void main(String[] args) {
        //Ex: Time'i formatlayiniz.

        LocalTime myTime=LocalTime.now();
        System.out.println("myTime = " + myTime); //myTime = 10:55:04.062573

        //hh==> 12'lik saat sistemi   - HH==> 24lük saat sistemi
        //hh kullanildiginda am veya pm denmelidir. Bunun icin "a" yazmaniz yeterlidir. Yani. "hh:mm a"

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("hh:mm:ss a");//12:07:25 ÖS

        System.out.println("dtf.format(myTime) = " + dtf.format(myTime)); //dtf.format(myTime) = 10-56 ÖÖ(AM)  ==> 12'lik sitem


    }
}
