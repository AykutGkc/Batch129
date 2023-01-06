package day14arraysforeachloop;

public class C02_Arrays02 {
    public static void main(String[] args) {



        String brr[] = new String[5];

        brr[0] = "Miami";
        brr[1] = "Istanbul";
        brr[2] = "Frankfurt";
        brr[3] = "Dhaka";
        brr[4] = "Athena";

        //1.Yol : For Loop
        int totalChar = 0;

        for (int i = 0; i < brr.length; i++) {

            totalChar = totalChar + brr[i].length();
        }
        System.out.println(totalChar); //33

        //2.Yol :  for-each-loop(Enhanced loop) ==> Baslangic degeri, loop'un calisma sarti ve increment/decrement kismini kendisi hallediyor.
        // For-Each loop "array" ve "collection" larda kullanilir.
        // Index kullanmaniz gerektiginde bazen for-each loop caresiz kalir.Mecburen diger loop'lar kullanilir.

        int sum=0;

        for (String w : brr ){
            sum=sum+w.length();
        }

        System.out.println(sum); //33









    }//Main
}//class
