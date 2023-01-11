package practice.Advancejavapractice.practiceday07_100123;

public class Sirket {

    static int kasa;
    int depBütcesi;
    int depKazandigiParaToplami;

    public void kasadanParaAl(int alinacakPara){
        depBütcesi+=alinacakPara;
        kasa-=alinacakPara;
        System.out.println("Kasadan "+ alinacakPara +" alindi");
    }

    public void paraKazan(int kazanilanPara){
        kasa+=kazanilanPara;
        depKazandigiParaToplami+=kazanilanPara;
        System.out.println(kazanilanPara+ " lira kazanildi.");
    }

    public static void kasadanHarca (int harcananPara){
        kasa-=harcananPara;
        System.out.println("Kasadan "+ harcananPara +" lira harcandi");
    }

    public void departmanHarcamasi (int harcananPara){
        depBütcesi-=harcananPara;
        System.out.println("Departman bütcesinden "+ harcananPara + " lira harcandi");

    }


}


