package z_mentorgrubu;

import java.util.Random;

public class C15_AdvantagePRactice_090123 {

    public static void main(String[] args) {



      /*  5)Rastgele bir harf veren bir method oluşturun ve ardından methodu kullanarak aşağıdakileri yazdırınız.(Q04_RandomMethod_RastgeleHarf)
        ‘A’ ve ‘a’ için “İlk Karakter” yazdırınız.
        ‘B’ ve ‘b’ için “İkinci Karakter” yazdırınız.
        ‘C’ ve ‘c’ için “Üçüncü Karakter” yazdırınız.
        ‘D’ ve ‘d’ için “Dördüncü Karakter” yazdırınız.
                Diğerleri için “Diğer Karakterleri” yazdırınız.
*/

        randomHarf();

    }

    public static void randomHarf(){
        Random random = new Random();
        int rastgeleSayi=random.nextInt(123);
        System.out.println(rastgeleSayi);



        if ((rastgeleSayi>=65 && rastgeleSayi<=90) || (rastgeleSayi>=97 && rastgeleSayi<=122)){
           char rastgeleHarf=(char)(rastgeleSayi);
            System.out.println(rastgeleHarf);
           switch (rastgeleHarf){
               case 'a':
               case 'A':
                   System.out.println("ilk karakter");
                   break;
               case 'b':
               case 'B':
                   System.out.println("ikinci karakter");
                   break;
               case 'c':
               case 'C':
                   System.out.println("ücüncü karakter");
                   break;
               case 'd':
               case 'D':
                   System.out.println("dördüncü karakter");
                   break;
               default:
                   System.out.println("diger karakter");
        }

        }




    }


}
