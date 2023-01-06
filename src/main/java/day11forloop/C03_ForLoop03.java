package day11forloop;

public class C03_ForLoop03 {
    public static void main(String[] args) {

        //Ex: Verilen bir string'de 'a' karakteri haric tüm karakterleri yazdiriniz.
        // "Madagaskar"==> Mdgskr

        String s = "Madagaskar";

        //1.Yol:

        String t =s.replaceAll("a","");
        System.out.println(t);

        //2.Yol:
        for (int i = 0 ; i <s.length(); i++) {
            char ch=s.charAt(i);
            if (ch != 'a') {
                System.out.print(ch);
            }
        }
        System.out.println();

        //3.Yol:

        for (int i =0 ; i <s.length(); i++) {
            char ch=s.charAt(i);
            if (ch=='a'){
                continue; //continue keyword'ü bazi sartlar icin loop'un adimlarini atlamamizi saglar.
            }
            System.out.print(ch);
        }




    }//Main Body
}//Class Body
