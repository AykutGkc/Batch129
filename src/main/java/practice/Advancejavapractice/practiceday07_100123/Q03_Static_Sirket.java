package practice.Advancejavapractice.practiceday07_100123;

public class Q03_Static_Sirket {
    //Basit bir şirket bütçesi kodu yazınız.

    public static void main(String[] args) {

    Sirket dep1=new Sirket();
        System.out.println("dep1.depBütcesi = " + dep1.depBütcesi);
        dep1.kasadanParaAl(500);
        System.out.println("dep1.depBütcesi = " + dep1.depBütcesi);

        System.out.println("Sirket.kasa = " + Sirket.kasa);
        dep1.paraKazan(2000);
        Sirket.kasadanHarca(1000);
        System.out.println("Sirket.kasa = " + Sirket.kasa);
        System.out.println("dep1.depKazandigiParaToplami = " + dep1.depKazandigiParaToplami);

        Sirket dep2=new Sirket();
        dep2.kasadanParaAl(500);
        dep2.departmanHarcamasi(250);
        dep1.departmanHarcamasi(100);
        System.out.println("Sirket.kasa = " + Sirket.kasa);
        System.out.println("dep2.depBütcesi = " + dep2.depBütcesi);
        System.out.println("dep1.depBütcesi = " + dep1.depBütcesi);
        dep2.paraKazan(5000);
        System.out.println("dep1.kasa = " + dep1.kasa);
        System.out.println("dep2.kasa = " + dep2.kasa);




    }
}
