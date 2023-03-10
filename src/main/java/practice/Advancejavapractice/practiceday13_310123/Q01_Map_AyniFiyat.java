package practice.Advancejavapractice.practiceday13_310123;

import java.util.HashMap;
import java.util.Map;

public class Q01_Map_AyniFiyat {
    public static void main(String[] args) {
        //Aşağıda verilen fiyat listesinden fiyatı 29.99 olan ürünlerin adlarını yazdırınız.

        Map<String, Double> urunler = new HashMap<>();
        urunler.put("Kemer", 19.99);
        urunler.put("Gomlek", 29.99);
        urunler.put("Kazak", 24.99);
        urunler.put("Pijama", 29.99);
        urunler.put("Ayakkabi", 89.99);
        urunler.put("Kravat", 19.99);
        urunler.put("Terlik", 29.99);

        System.out.println("urunler = " + urunler);

        System.out.println("urunler.values() = " + urunler.values());
        System.out.println("urunler.keySet() = " + urunler.keySet());

        for (Map.Entry<String, Double> w:urunler.entrySet()){
            if(w.getValue()==29.99){
                System.out.println(w.getKey()+"-->"+w.getValue());
            }
        }
        
    }
}
