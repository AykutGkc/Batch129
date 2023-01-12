package day24accessmodifiersinheritance;
 public class Student {

    public String name="Tom Hanks";
    //name herkse tarafindan bilinebilir o yüzden public yapildi.
    String stdId="TH2023HU12001";
    // student Id  okul yönetiminde ki insanlar tarafindan bilinebilir o yüzden default yapildi.
    protected int accountNum=76512345;
    //account number ben esim ve cocuklarim tarafindan bilinebilir, o yüzden protected yapildi.
    private int balance=123000;
    //hesabimda ki para miktari sadece benim tarafimdan bilinmeli bu yüzden private yapildi.

        /*

        1)Access modifier'lar genisten dara dogru: public,protected,default,private
        2)Class'lar protected ve private olamazlar sadece, public ve default olabilirler.
        3)Access modifier'lar ne ise yarar?
            -Variablara methodlara classlara ulasmayi düzenler
        4)Kac tane access modifier vardir?
            -public > protected > default > private

         i)publicler icin hicbir sinirlama yoktur projenin her yerinden ulasilabilir
         ii)protected ayni packagein icinden ya da farkli packagelarda o packagedeki cocuklar ulasabilir.
         iii)default sadece ayni packageden ulasilabilir. Bu yuzden defaultlarin diger adi package private'dir
         iv) "private"  sadece class icinden ulasilabilir, class disina cikildiginda ulasilamaz
         v) "protected" ile "default"un farki nedir ?
           Package disina ciktigimizda childlardan "protected"lara ulasabiliriz. "default"lara ulasamayiz.

        */





}
