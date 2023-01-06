package day14arraysforeachloop;

import java.util.Arrays;

public class C04_Arrays04 {
    public static void main(String[] args) {

        //EX: String bir Array olusturunuz, 6 tane eleman yerlestiriniz, charaacter sayisi 5'den büyük elemanlari siliniz.

        String colors[]=new String[6];

        colors[0]="Red";
        colors[1]="Orange";
        colors[2]="Blue";
        colors[3]="Yellow";
        colors[4]="Green";
        colors[5]="Brown";
        System.out.println(Arrays.toString(colors));

        //Logic: Yeni bir Array olusturup karakter sayisi 5 ve 5 den kücük olan elemanlari yeni Arraya transfer edecegiz.
        //      Böylece yeni array de karakter sayisi 5 den büyük olan hic bir eleman olmayacak.

        //soru: Hocam Array olusturmak icin iki sey belirtilmelidir.
        //      1)Elemanlarin data type
        //      2)Yeni array kac eleman olacak

        //verilen array de eleman sayisi 5 ve 5'den kücük olan kac eleman vardir bulmaliyiz.

        int counter=0;

        for (String w : colors) {
            if(w.length()<=5){
                counter++;
            }
        }
        System.out.println(counter);

        //Yeni array olustur
        String newColors[] = new String[counter];
        //Karakter sayisi 5 ve 5'den kücük olanlari transfer et.
        int idx=0;

        for(String w : colors){
            if(w.length()<=5){
                newColors[idx]=w;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newColors));//[Red, Blue, Green, Brown]





    }//Main
}//Class
