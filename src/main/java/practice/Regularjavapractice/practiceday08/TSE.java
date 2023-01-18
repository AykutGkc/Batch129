package practice.Regularjavapractice.practiceday08;

public abstract class TSE {

    public static void main(String[] args) {

        BagetEkmek baget=new BagetEkmek();
        baget.gramaj500();
        baget.hijyenikOlma();
        baget.odunAtesindePiser();
        baget.undanYapilir();

        System.out.println("***********************");

        DiyetEkmek diyet=new DiyetEkmek();

        diyet.hijyenikOlma();
        diyet.undanYapilir();
        diyet.odunAtesindePiser();






    }//Main

    abstract void gramaj500(); //Childlar buna uymak zorunda
    abstract void hijyenikOlma();

    void odunAtesindePiser(){
        System.out.println("TSE odun atesinde piser");
    }

    void undanYapilir(){
        System.out.println("TSE undan yapilir");
    }


}
