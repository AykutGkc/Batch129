package day18lists;

import java.util.ArrayList;
import java.util.List;

public class C03_Lists03 {
    public static void main(String[] args) {

        //EX1: Bir integer listte ki 7 haric tüm elemanlari 3 artiriniz.

        List<Integer> nums = new ArrayList<>();

        nums.add(12);
        nums.add(23);
        nums.add(7);
        nums.add(12);
        nums.add(11);

        //1.Yol:


        for (Integer w : nums) {

            if (w==7){
                continue;
            }
            nums.set(nums.indexOf(w),w+3);
        }

        System.out.println(nums);

        //2.yol

        for (int i = 0; i < nums.size() ; i++) {
            int element=nums.get(i);
            if (nums.get(i)==7){
                continue;
            }
            nums.set(i,nums.get(i)+3);
        }

        System.out.println(nums);

        /*
        nums.indexOf(w) ilk görünümün indexini verir.List tekrarli elemana sahip ise
        nums.indexOf(w) kullanimi risk olusturabilir. Bu yüzden bu soruda en güvenli yol "for-loop"tur.
         */







    }//Main
}//class
