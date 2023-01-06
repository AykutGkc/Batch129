package z_mentorgrubu;

import java.util.ArrayList;
import java.util.List;

public class C12_day18_050123 {
    public static void main(String[] args) {

        //EX 1: Elektronik aletleri ve ev aletleri listlerimiz var.
        //      Elektronik ev aletlerini listeleiyiniz.

        List<String> electronics= new ArrayList<String>();
        electronics.add("TV");
        electronics.add("Radio");
        electronics.add("Refrigetor");
        electronics.add("Mobile Phone");
        electronics.add("Notebook");

        List<String> homeGoods= new ArrayList<String>();
        homeGoods.add("Carpet");
        homeGoods.add("Fork");
        homeGoods.add("Radio");
        homeGoods.add("Chair");
        homeGoods.add("TV");


       homeGoods.retainAll(electronics);




        System.out.println("homeGoods = " + homeGoods);


    }
}
