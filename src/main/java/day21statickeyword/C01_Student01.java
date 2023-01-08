package day21statickeyword;

public class C01_Student01 {

        /*
        1)Static variable veya static methodlar tüm object'ler(Class member) icin ortak elemanlardir.
        2)Static class memberlar üzerinde yapilan tüm degisiklikler tüm objecleri etkiler.
        3) Static class memberlar Class'a, non-static class memberlar objectlere monte edilir.
           Mesela bir classstan 100 tane object olusturdugunuzda non-static olanlar 100 kere olusturulur
           ama static olanlar object sayisindan bagimsiz olarak bir kere olusturulur.
        4)static class membere'lara ulasmak icin object olusturmaya gerek  duyulmaz, ama non-static classlara
          ulsamak icinn object olusturmak sarttir.
         5)static variable'larin diger adi "Class Variable"dir.
           Non-Staic variable'larin diger adi "instance variable" veya "Object variable"dir.
         */

    public static String stdName = "Tom Hanks";
    public int age = 13;


    //Ögrenci isimlerinin ilk harflerini veren methodu olusturunuz.

    public static String getInitials(String name) {

        String first = name.substring(0, 1);
        String second = name.split(" ")[1].substring(0, 1);
        return first + second;
    }

    //Ögrenci isminde ki sesli harfeleri(a,e,i,o,u) sayan bir method olusturun.

    public int countVowels(String name) {
        int counter = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.toLowerCase().charAt(i);
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    counter++;
                break;
            }
        }//for
        return counter;
    }


}//class
