package day23datetimestringbuilder;

public class C02_StringBuilder01 {
    public static void main(String[] args) {

    /*
    Javada String, "String class" kullanilarak veya "StringBuilder class" kullanilarak olusturulabilir.
     "String class" kullanarak ürettigimiz Stringler "Immutable(degistirilemez)"dir
     "StringBuilder class" kullanarak ürettigimiz Stringler "Mutable(degistirilebilir)"dir.

     */
        //Immutable
        String s ="Java";
        String t = s+ "!";
        String w=t+"?";

        //Stringi degistirdikten sonra ayni String assign ederseniz, java yine yeni bir container olusturur.
        //degismis degeri bu yeni containerin icine koyar ve eski containeri gösteren oku yeni containera yönlendirir.
        //Dolayisiyla eski container adressiz kalir ve "Garbage collector" adressiz olan containerlari siler.
        String a="Money";
        a=a+"More";


        //Mutable
        //StringBuilder kullanarak String üretmenin 1.Yolu:
        StringBuilder sb =new StringBuilder("Pythom");
        System.out.println(sb);

        sb.append("!").append("?").append(".");
        System.out.println(sb);

        //StringBuilder kullanarak String üretmenin 2.Yolu:
        StringBuilder sb2=new StringBuilder();
        System.out.println(sb2.length());//0
        //StringBuilder kullanildiginda baslangic kapasitesi 16'dir
        //Kapasite asildiginda varolan kapasitenin iki fazlasi kadar var olan kapasiteye eklenir.
        // 16==>16*2+2   -   34 ==> 34*2+2
        System.out.println(sb2.capacity());//16

        sb2.append("Java");
        System.out.println(sb2.length());//4
        System.out.println(sb2.capacity());//16

        sb2.append("xxxxxxxxxxxxxxx");
        System.out.println(sb2.length());//19
        System.out.println(sb2.capacity());//34

        sb2.append("yyyyyyyyyyyyyyyyy");
        System.out.println(sb2.length());//35
        System.out.println(sb2.capacity());//70

        //StringBuilder kullanarak String üretmenin 3.Yolu:
        StringBuilder sb3=new StringBuilder(3);//Capacity biz belirleyebiliriz.

        sb3.append("Flo");
        System.out.println(sb3.length());//3
        System.out.println(sb3.capacity());//3

        sb3.insert(2,"xxxx");
        System.out.println(sb3.length());//7
        System.out.println(sb3);//Flxxxxo

        //toString() methodu StringBuilderi Stringe cevirir.
        //String classda varolan ama String Builder classta varolmayan (ör.split()) methodlara ihtiyac duydugumuzda
        //toString() methodunu kullanarak String Class gecer ve o methodu kullaniriz.
        sb3.toString().split("l");
        System.out.println("sb3 = " + sb3);

        //Stringi tekrar StringBuildera cevirebilirsiniz.
        StringBuilder sb4=new StringBuilder(sb3);

        //revere() methodu Stringleri ters cevirir.
        sb3.reverse();
        System.out.println(sb3);

        //deleteCharAt(1) metodu indeks 1 deki karakteri siler.
        sb3.deleteCharAt(1);
        System.out.println(sb3);

        //delete(1,6) --> index 1 deki characteren index 5(dahil) deki karaktere kadar tüm karakterleri siler.
        sb3.delete(1,6);

        StringBuilder sb5=new StringBuilder("Java");
        StringBuilder sb6=new StringBuilder("Java");
        //sb5.compareTo(sb6) methodu sb5 ile sb6yi alfabetik olarak karsilastirir.
        //sb5 alfabetik siralamada ise sonuc negatif sonra ise sonuc pozitif olur.
        System.out.println(sb5.compareTo(sb6));//0 ise aynidir.

        //setCharAt(2, 'm'); index 3deki characteri 'm' cevirir.
        sb6.setCharAt(2,'m');
        System.out.println(sb6);//Jama


        sb6.replace(1,3, "xyz");
        System.out.println(sb6);// Jxyza

        //StringBuilder Class'da kullanmamiza izin verilen  substring() method gibi  bazi String Class methodlari vardir.
        //bu methodlari StringBuilder üstpnde kullaninca StringBuilder'in orjinal degeri degismez.
        sb6.substring(1,3);
        System.out.println(sb6);//Jxyza




    }//Main
}//Class
