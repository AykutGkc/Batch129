package day33maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps01 {
    public static void main(String[] args) {

        /*
        1)Map'ler "USA=400.000.000" seklinde data depolamamiz gerektiginde kullanilir.
        2)"USA=400.000.000" datasinin "USA" kismi "key" olarak adlandirilir ve "key"ler unique'dir.
        3)"USA=400.000.000" datasinin "400.000.000" kismi "value" olarak adlandirilir ve "value"ler tekrarli olabilir.
        4)"Map"lerde depoladiginiz her bir depoya "Entry" denir, "Eleman" denmez.
        5)"Entry"ler inique'dir.Cünkü "key" kismi unique oldugu icin herbir entry digerinden farklidir.

        6)HashMap cok hizlidir cünkü HashMapler siralama ile ugrasmazlar.
        7)"HashMap"lerde bir tane "key"i "null" yapabilirsiniz.
        8)"HashMap"lerde birden fazla "value"i "null" yapabilirsiniz.
        9)"HashMap"ler "Multi-Thread"lar icin kullanilmaz ve "synchronization" yoktur.
         */

        HashMap<String, Integer> hm =new HashMap<>();
        System.out.println(hm);//{}

        //HashMap'lere nasil entry eklenir?
        hm.put("USA", 400000000);
        hm.put("Germany", 83000000);
        hm.put("Albania",3000000);
        //Ayni "key"i kullanarak yeni bir "entry" eklersenniz var olan "value"u update etmis olursunuz.
        hm.put("Albania",2800000);
        hm.put(null,12000000);
        hm.put(null,18000000);
        hm.put("Myanmar",null);
        hm.put("Bhutan",null);
        System.out.println(hm);//{null=18000000, Myanmar=null, USA=400000000, Bhutan=null, Germany=83000000, Albania=2800000}

        //HashMap'lerde sadece "key" almak istiyorum.
        Set<String> hmKeys=hm.keySet();
        System.out.println(hmKeys);//[null, Myanmar, USA, Bhutan, Germany, Albania]

        ////HashMap'lerde sadece "value" almak istiyorum.
        //Example: hm Map'indeki ülkelerin nufüsünu bulunuz.

        Collection<Integer> hmValues=hm.values();
        int sum=0;

        for (Integer w : hmValues) {
            if (w!=null){
                sum=sum+w;
            }
        }
        System.out.println(sum);//503800000

        //HashMaplerde belirli bir "key"in valuesunu nasil aliriz?
        Integer usaPopulation=hm.get("USA");
        System.out.println(usaPopulation);//400000000


        //HashMaplerde replace() methodu varolan bir "key"in "value"sunu degistirmek icin kullanilir.
        hm.replace("Bhutan",35000000);
        System.out.println(hm);//{null=18000000, Myanmar=null, USA=400000000, Bhutan=35000000, Germany=83000000, Albania=2800000}

        hm.putIfAbsent("USA",700000000);
        System.out.println(hm);//{null=18000000, Myanmar=null, USA=400000000, Bhutan=35000000, Germany=83000000, Albania=2800000}

        hm.putIfAbsent("India", 700000000);
        System.out.println(hm);//{null=18000000, Myanmar=null, USA=400000000, Bhutan=35000000, Germany=83000000, Albania=2800000, India=700000000}

        //Example2: Yeni ögretmenin maasi standart ücretten 1000 tl fazla, eski ögretmenin maasi standart ücretten 2000tl fazla olsun.

        HashMap<String, Integer> salaries=new HashMap<>();

        salaries.put("Ali",8000);
        salaries.put("Ayse",5000);
        salaries.put("Veli",9000);
        salaries.put("Tom",9900);

        String teacherName="Kemal";

        if(salaries.keySet().contains(teacherName)){
            salaries.put(teacherName,12000);
        }else{
            salaries.putIfAbsent(teacherName, 11000);
        }
       System.out.println(salaries);//{Tom=9900, Veli=9000, Ayse=5000, Kemal=11000, Ali=8000}

        //hm.replace("USA",400000000,500000000) methodu key USA ve value 400000000 ise value'u 500000000 yapar
        hm.replace("USA",400000000,500000000);
        System.out.println(hm);//{null=18000000, Myanmar=null, USA=500000000, Bhutan=35000000, Germany=83000000, Albania=2800000, India=700000000}

        //getOrDefault(9 methodu olan "key"lerin degerini verir, olmayan "key"ler icin ikinci parametreye yazdiginiz degeri verir.
        Integer r=hm.getOrDefault("Bhutan",0);
        System.out.println(r);//35000000

        //entrySet() methodu "MAp"i "Set"e cevirir.
        //Setlerin methodlarini kullanabilmek icib entrySet methodunu kullanarak Map'i Set'e cevirebiliriz.
        //MAp'i set'e cevirdigimiz de setin bütün özelliklerini kullanabiliriz. MEsela loop gibi.
        //EntrySet methodunu kullandiginizda elde ettiginiz Set'in elemanlari "Map.Entry<String, Integer>" seklinde bir map olur.
        //Bu yüzden elemanlar icin Map Methodlar kullanilabilir.
        Set<Map.Entry<String, Integer>> myEntries=hm.entrySet();
        System.out.println(myEntries);//[null=18000000, Myanmar=null, USA=500000000, Bhutan=35000000, Germany=83000000, Albania=2800000, India=700000000]

        //Example 3: Ülke ismindeki karakter sayisini ülke nufüsüna ekleyen ve sonucu console yazdiran kodu yaziniz.

        for(Map.Entry<String, Integer> w: myEntries){
            if (w.getValue()!=null && w.getKey()!=null){
                int toplam= w.getValue()+w.getKey().length();
                System.out.println(toplam);
            }

        }




    }
}
