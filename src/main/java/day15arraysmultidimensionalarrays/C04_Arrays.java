package day15arraysmultidimensionalarrays;

public class C04_Arrays {
    public static void main(String[] args) {

        //Bir arrayin icinde herhangibir elemanin olup olmadigini kontrol eden ve kac kere tekrarlandigini gösteren kodu yaziniz.

        int arr[]={5,2,5,-3};

        int eleman=5;

        int sayac=0;

        for (int w : arr) {

            if (w==eleman){
                sayac++;
            }//If

        }//for-each

        if(sayac>0 ){
            System.out.println(eleman + " arrayde "+sayac + " defa var.");
        }else{
            System.out.println(eleman + " arrayde yok");;
        }






    }//Main
}//class
