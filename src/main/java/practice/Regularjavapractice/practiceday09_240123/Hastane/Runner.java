package practice.Regularjavapractice.practiceday09_240123.Hastane;

public class Runner {
    private static Hastane hastane = new Hastane();


    public static void main(String[] args) {

        String hastaDurumu = "Bas agrisi";
        String unvan=doktorUnvan(hastaDurumu);
        hastane.setDoktor(doktorBul(unvan));

        System.out.println("Doktor ismi : " + hastane.getDoktor().getIsim());
        System.out.println("Doktor Soy ismi : " + hastane.getDoktor().getSoyIsim());
        System.out.println("Doktor Unvan : " + hastane.getDoktor().getUnvan());






    }

    private static Doktor doktorBul(String unvan) {
        Doktor doktor=new Doktor();

        for (int i = 0; i <hastane.unvanlar.length ; i++) {

            doktor.setIsim(hastane.doctorIsimleri[i]);
            doktor.setSoyIsim(hastane.doctorSoyIsimleri[i]);
            doktor.setUnvan(unvan);

        }//fori
        return doktor;
    }//method

    private static String doktorUnvan(String hastaDurumu) {
        if (hastaDurumu.equals("Alerji")) {
            return hastane.unvanlar[0];
        } else if (hastaDurumu.equals("Bas agrisi")) {
            return hastane.unvanlar[1];
        } else if (hastaDurumu.equals("Diyabet")) {
            return hastane.unvanlar[2];
        } else if (hastaDurumu.equals("Kalp spazmi")) {
            return hastane.unvanlar[3];
        }else{
            return "yanlisdurum";
        }
    }//Method
}//Class