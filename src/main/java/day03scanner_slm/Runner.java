package day03scanner_slm;

public class Runner {

    public static void main(String[] args) {
        //Object nasil olusturulur?
        //Class ismi    object ismi     Atama operatörü    "new" keyword     Constructor(yapan)
           Car              myCar            =                 new              Car();

        System.out.println(myCar.fiyat);

        System.out.println(myCar.model);

        myCar.hareket();

        myCar.dur();

        Student tomHanks=new Student();
        System.out.println(tomHanks.name);
        System.out.println(tomHanks.grade);
        System.out.println(tomHanks.address);

        tomHanks.study();
        tomHanks.feed();

    }
}
