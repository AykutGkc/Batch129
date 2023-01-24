package practice.Advancejavapractice.practiceday11_240123.abstruction_alan_hesaplama;

public class AbstructionRunner {
    //Dikdörtgen ve üçgenin alanlarını hesaplayan bir kod yazınız.(abstraction kullanın)



    public static void main(String[] args) {

        Dikdörtgen dikdörtgen=new Dikdörtgen();

        System.out.println(dikdörtgen.alanHesapla(5, 4));
        System.out.println(dikdörtgen.alanHesapla(7, 4));

        Ucgen ucgen=new Ucgen();
        System.out.println(ucgen.alanHesapla(6, 2));
        System.out.println(ucgen.alanHesapla(10, 5));


    }
}
