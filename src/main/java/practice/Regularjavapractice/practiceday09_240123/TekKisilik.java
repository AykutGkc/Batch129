package practice.Regularjavapractice.practiceday09_240123;

public class TekKisilik extends Otel{

    public static void main(String[] args) {

        TekKisilik musteri1=new TekKisilik();

        System.out.println("Musteri1 TV ücreti"+musteri1.TV(5)+"$");


    }

    public int TV(int saat){
        return saat*2;//tv izlemenin saati 2 dolar
    }

}
