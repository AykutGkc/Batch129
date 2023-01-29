package practice.Regularjavapractice.practiceday09_240123;

public class KralDairesi extends Otel{
    public static void main(String[] args) {
        KralDairesi musteri3=new KralDairesi();
        musteri3.kahvalti();
        System.out.println("Musteri3 TV ücreti: "+musteri3.TV("international", 7)+"$");
        System.out.println("Musteri3 wifi ücreti : "+musteri3.wifi(8)+"$");
    }
    @Override
    public void kahvalti() {
        System.out.println("Kahvalti yataga gelir");
    }

    public int TV(String international, int saat){
        if (international.equals("international")){
            return saat*100;
        }else
            return 0;
    }

}
