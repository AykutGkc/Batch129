package practice.Regularjavapractice.practiceday08;

public class Kumanda {

    private double genislik;
    private double yükseklik;
    private double ekranBüyüklügü;
    private int maxVolume = 32;
    private int ses = 10;
    private boolean guc;


    public Kumanda(double genislik, double yükseklik, double ekranBüyüklügü) {
        this.genislik = genislik;
        this.yükseklik = yükseklik;
        this.ekranBüyüklügü = ekranBüyüklügü;
    }//Constructor

    public String kanalDegistirme(String kanal) {

        switch (kanal) {
            case ("A"):
                return kanal;
            case ("B"):
                return kanal;
            case ("C"):
                return kanal;
        }
        return kanal;
    }

    public void gucDugmesi(){
        this.guc=!guc;
        System.out.println(guc);
    }

    public int sesAzaltma (){
        if (ses>0){
            ses--;
        }return ses;
    }

    public int sesArtirma (){
        if (ses<maxVolume){
            ses++;
        }return ses;
    }


}
