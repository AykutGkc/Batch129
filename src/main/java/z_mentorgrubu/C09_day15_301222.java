package z_mentorgrubu;

public class C09_day15_301222 {
    public static void main(String[] args) {


       // 6)Bir stringdeki sesli harflerin sayisini bulan kodu yaziniz.(C02_Arrays)

        String str="Damlaya damlaya gol olur";

        str=str.toLowerCase();

        String arr []=str.split("");

        int sayac=0;

        //a e o u i

        for (String w : arr) {

            switch (w) {
                case "a":
                case "e":
                case "o":
                case "u":
                case "i":

                    sayac++;
            }

        }

        System.out.println(sayac);



    }
}
