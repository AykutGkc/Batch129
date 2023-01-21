package day30excaptionsinterface;

public class HondaRunner {
    public static void main(String[] args) {

        Civic myCivic=new Civic();
        myCivic.cool();

        System.out.println(AC.price);
        System.out.println(Engine.price);
        System.out.println(Security.price);

       // AC.price=7000; ==> final variabla deger atanamaz.

        System.out.println(AC.model);

        Accord myAccord=new Accord();
        myAccord.cool();


    }
}
