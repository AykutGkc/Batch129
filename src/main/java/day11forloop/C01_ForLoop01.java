package day11forloop;

public class C01_ForLoop01 {
    public static void main(String[] args) {

        //Example 1) Verilen bir String'de ilk 'a' harfinden önce ki tüm karakterleri konsola yazdiriniz.
        // "I love Java" ==> "I love J"

        String s="Tramvay";



        for (int i = 0 ; i<s.length(); i++){
            char ch = s.charAt(i);
            if (ch=='a'){
                break;
            }
            System.out.print(ch);
        }





    } //Main Body
}//Class Body
