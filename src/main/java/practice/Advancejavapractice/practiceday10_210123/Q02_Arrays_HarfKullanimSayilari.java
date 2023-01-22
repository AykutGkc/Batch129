package practice.Advancejavapractice.practiceday10_210123;

public class Q02_Arrays_HarfKullanimSayilari {

    /*
    Girilen String de hangi harfin kac kere kullanildigini yazan kodu yaziniz.
    Input: String str="Java is so Good";
    Output: strOutput="J1 a2 v1 i1 s2 o3 G1 d1";
     */

    public static void main(String[] args) {

        String str="Java is so Good";
        String [] arr=str.split("");
        int kullanimSayisi;
        String sonuc="";

        for (String w : arr) {
            kullanimSayisi=0;
           for (String u:arr){

               if (w.equals(u)){
                   kullanimSayisi++;
               }
           }
           if (!sonuc.contains(w)){
               sonuc+=w+kullanimSayisi+" ";
           }
        }

        System.out.println("sonuc = " + sonuc);

    }//MAin
}//Class
