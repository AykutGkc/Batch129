package day13whileloopdowhileloop.day22staticblocksconstructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime01 {

    public static void main(String[] args) {

        //Date Class

        Date myDate=new Date();

        System.out.println(myDate);//Sat Jan 07 21:28:29 CET 2023


        System.out.println(myDate.getTime());//1673123309669 ==> 1 ocak 1970 den su ana kadar ki milisaniye miktari.

        //Icinde bulundugumuz an nasil alinir?
        System.out.println(LocalDate.now());//2023-01-07
        System.out.println(LocalTime.now());//21:34:39.098978
        System.out.println(LocalDateTime.now());//2023-01-07T21:36:05.432154

        //Dünyanin herhangibir saat diliminde ki saat nasil alinir.
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo")));//2023-01-08T05:44:53.063692

        //Ileriki bir tarihe nasil gidilir?
        System.out.println(LocalDate.now().plusYears(7).plusMonths(5).plusDays(35));//2030-07-12

        //Geri bir tarihe nasil gidilir?
        System.out.println(LocalDate.now().minusYears(4).minusMonths(3).minusDays(2));//2018-10-05

        //Ileriki bir zamana nasil gidilir?
        System.out.println(LocalTime.now().plusHours(3));

        //Geri bir zamana nasil gidilir?
        System.out.println(LocalTime.now().minusMinutes(45));//21:13:07.741855

        //Zamanda belli bir böllümü nasil aliriz?
        System.out.println(LocalTime.now().getHour() +":"+ LocalTime.now().getMinute()); //22:0

        //Tarihte belli bir böllümü nasil aliriz?
        System.out.println(LocalDate.now().getMonth()+ ":" + LocalDate.now().getDayOfMonth()); //JANUARY:7
        System.out.println(LocalDate.now().getMonthValue()+ ":" + LocalDate.now().getDayOfMonth()); // 1:7


        //Iki Tarih nasil karsilastirilir?
        //02/13/2005 - 03/01/2007

        boolean result=LocalDate.of(2005,02,13).isBefore(LocalDate.of(2007,03,01));
        System.out.println(result);//true

        //Tarihlerin formatlari nasil degistirilir?
        //M--> Tek rakam ile ay nosunu yazar. MM--> iki rakamla ay noasunu yazar.
        //MMM--> ay isminin ilk üc harfini yazar. MMMM-->Ay isminin tamamini yazar.

        //d--> Tek rakamla gün npsunu yazar.  dd-->iki rakamla gün nosunu yazar.

        //yy --> Yilin son iki rakamini yazar.  yyyy --> Yilin tamamini yazar.
        DateTimeFormatter dtf =DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(dtf.format(LocalDate.now()));//07/01/2023



    }

}
