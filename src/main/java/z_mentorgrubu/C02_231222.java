package z_mentorgrubu;

public class C02_231222 {
    public static void main(String[] args) {

        //  int arr[] = { 5, 1, 1, 9, 7, 2, 6, 10 }; bu array de 7 elemaninin olup olmadigini kontrol etme,
        //    var ise true, yoksa false yazdiran metotu olusturun

        int arr[] = {5, 1, 1, 9, 7, 2, 6, 10};

        int eleman = 0;
        int sayac=0;

        for (int w : arr) {
            if (w == eleman) {
             sayac++;
            }
        }

        if (sayac>0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }







    }
}
