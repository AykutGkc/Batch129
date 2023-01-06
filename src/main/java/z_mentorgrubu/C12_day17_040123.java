package z_mentorgrubu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C12_day17_040123 {
    public static void main(String[] args) {


        //2)Bir tane integer list olusturunuz. Bu listte birbirine en yakin tamsayiyi yaziniz.(C02_Lists02)
        //         [12,23,9,11,35] ==> 12,11

        List<Integer> yas=new ArrayList<>();

        yas.add(10);
        yas.add(12);
        yas.add(18);
        yas.add(13);
        yas.add(50);

        Collections.sort(yas);
        int fark=yas.get(1)-yas.get(0);

        for (int i=1 ; i<yas.size() ; i++) {
             fark=Math.min(fark,yas.get(i)-yas.get(i-1)); //1

        }
        System.out.println(fark);


        for (int i = 1; i < yas.size() ; i++) {
            if (fark==yas.get(i)-yas.get(i-1)){
                System.out.println(yas.get(i)+ "," + yas.get(i-1));
            }
        }





    }



}
