package practice.Advancejavapractice.practiceday06_071223;

public class Q04_MethodOverloading_Hacim {
    public static void main(String[] args) {

        //Küp, kare prizma ve dikdörtgen prizmanın hacmini hesaplayan bir method oluşturunuz.(Method overloading kullanınız)

       Hacim obje = new Hacim();

       int küpünHacmi=obje.hacimHesapla(5);
        System.out.println("küpünHacmi = " + küpünHacmi);

        int karePrizmaHacmi=obje.hacimHesapla(5,6);
        System.out.println("karePrizmaHacmi = " + karePrizmaHacmi);

        int dikdörtgenlerPrizmaHacmi=obje.hacimHesapla(3,4,5);
        System.out.println("dikdörtgenlerPrizmaHacmi = " + dikdörtgenlerPrizmaHacmi);

        int kupunHacmi2=obje.hacimHesapla(2);
        System.out.println("kupunHacmi2 = " + kupunHacmi2);


    }//Main
}//class

