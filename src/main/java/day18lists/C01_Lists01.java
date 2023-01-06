package day18lists;

import java.util.ArrayList;
import java.util.List;

public class C01_Lists01 {
    public static void main(String[] args) {

        //Ex:1 Integer bir list olusturunuz.
        //Liste 5 eleman ekleyiniz.
        //Bu elemanlardan 12'yi siliniz.

        List<Integer> ages= new ArrayList<>();

        ages.add(10);
        ages.add(25);
        ages.add(12);
        ages.add(8);
        ages.add(12);

        //Note:Siz java da tam sayi yazdiginizda, java o tamsayinin data type'ni otomatik olarak "Primitiv int" kabul eder.
        //Bu yüzden remove() methodunun icine yazdiginiz tamsayi eleman olarak degil index olarak kabul edilir.
        //Tamsayiyi eleman olarak göstermenin bir kac yolu vardir.
        //==> ilk 12yi siler.
        //1.Yol
        //Integer nonPrimitive=12; ==>Memory de yeni yol kullanildi. Fazladan is
        //ages.remove(nonPrimitive);


        //2.yol ==TAvsiye edilen yol.
        //ages.remove((Integer)12);


        //3.yol
        //ages.remove(Integer.valueOf(12)); ==>iki method olusturuldu

        //4.yol
        //ages.remove(ages.indexOf(12));  ==> iki method kullanildi

        //System.out.println(ages);


        //Ex:2 Intger bir list olusturunuz.
        //Liste 5 eleman ekleyiniz.
        //Bu elemanlardan tüm 12'leri siliniz.

        List<Integer> nums=new ArrayList<>();
        nums.add(10);
        nums.add(25);
        nums.add(12);
        nums.add(8);
        nums.add(12);

        List<Integer> silinecekler=new ArrayList<>();
        silinecekler.add(12);
        silinecekler.add(25);

        //RemoveAll() methodu list ile calisir.
        //Bir veya birden fazla elemanlarin tüm görünümlerini silmek icin kullanilir.
        nums.removeAll(silinecekler);
        System.out.println(nums);















    }//Main
}//class
